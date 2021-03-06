package com.laiyifen.library.net.base;

import com.laiyifen.library.net.utils.HttpUtils;

import okhttp3.RequestBody;

/**
 * Created by Wisn on 2018/5/3 上午10:41.
 */

public abstract class NoBodyRequest<T, R extends NoBodyRequest> extends Request<T, R> {
    private static final long serialVersionUID = 1200621102761691196L;

    public NoBodyRequest(String url) {
        super(url);
    }

    @Override
    public RequestBody generateRequestBody() {
        return null;
    }

    protected okhttp3.Request.Builder generateRequestBuilder(RequestBody requestBody) {
        url = HttpUtils.createUrlFromParams(baseUrl, params.urlParamsMap);
        okhttp3.Request.Builder requestBuilder = new okhttp3.Request.Builder();
        return HttpUtils.appendHeaders(requestBuilder, headers);
    }
}

