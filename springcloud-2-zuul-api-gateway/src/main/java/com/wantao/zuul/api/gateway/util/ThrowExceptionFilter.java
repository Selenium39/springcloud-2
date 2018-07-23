package com.wantao.zuul.api.gateway.util;/*
 *author:wantao
 *createTime:18-7-23 10:27
 *description:
 */

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

@Component
public class ThrowExceptionFilter extends ZuulFilter {

    private static final Logger logger = Logger.getLogger("ThrowExceptionFilter.class");

    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        logger.info("this is a pre filter,it will throw a runtime exception");
        RequestContext ctx = RequestContext.getCurrentContext();
        try {
            dosomething();
        } catch (Exception e) {
            ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            ctx.set("error.exception", e);
        }
        return null;
    }

    private void dosomething() {
        throw new RuntimeException("EXIST SOME ERROR");
    }
}
