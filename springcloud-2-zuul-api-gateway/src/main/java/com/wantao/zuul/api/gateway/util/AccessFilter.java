package com.wantao.zuul.api.gateway.util;/*
 *author:wantao
 *createTime:18-7-23 09:34
 *description:
 */

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;


public class AccessFilter extends ZuulFilter {
    private static final Logger logger=Logger.getLogger("AccessFilter.class");
    @Override
    public String filterType() {//过滤器类型,决定过滤器在请求的哪个生命周期是执行,这里代表会在路由之前执行
        return "pre";
    }

    @Override
    public int filterOrder() {//执行顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {//判断过滤器是否需要被执行
        return true;
    }

    @Override
    public Object run() throws ZuulException {//过滤器具体逻辑
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest request=ctx.getRequest();
        logger.info("send "+request.getMethod()+" request to "+request.getRequestURL().toString());
        Object accessToken =request.getParameter("accessToken");
        if(accessToken==null){
            logger.warning("accessToken is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        logger.info("access token ok");
        return null;
    }
}
