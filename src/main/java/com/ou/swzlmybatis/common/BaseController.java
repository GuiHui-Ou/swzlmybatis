package com.ou.swzlmybatis.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author leo
 */
@Slf4j
public class BaseController {

    protected Integer getPageSize(Integer param, Integer defaultValue) {
        param = getParam(param, defaultValue);
        if (param < 1) {
            param = defaultValue;
        }
        return param;
    }

    protected Integer getIntParam(Integer param, Integer defaultValue) {
        return getParam(param, defaultValue);
    }

    protected String getStringParam(String param, String defaultValue) {
        return getParam(param, defaultValue);
    }

    protected Double getDoubleParam(Double param, Double defaultValue) {
        return getParam(param, defaultValue);
    }

    private <T> T getParam(T param, T defaultValue) {
        if (param == null) {
            param = defaultValue;
        }
        return param;
    }

}
