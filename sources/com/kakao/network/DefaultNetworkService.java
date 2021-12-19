package com.kakao.network;

import com.bytedance.covode.number.Covode;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.network.response.ApiResponseStatusError;
import com.kakao.network.response.CustomErrorConverter;
import com.kakao.network.response.ResponseBody;
import com.kakao.network.response.ResponseData;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.network.tasks.ITaskQueue;
import com.kakao.network.tasks.KakaoResultTask;
import com.kakao.util.helper.log.Logger;
import java.util.List;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public class DefaultNetworkService implements NetworkService {
    private ITaskQueue taskQueue;

    static {
        Covode.recordClassIndex(34356);
    }

    DefaultNetworkService(ITaskQueue iTaskQueue) {
        this.taskQueue = iTaskQueue;
    }

    @Override // com.kakao.network.NetworkService
    public <T> T request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter) {
        ResponseData request = new NetworkTask().request(iRequest);
        Logger.d(request.getStringData());
        if (request.getHttpStatusCode() == 200) {
            return responseStringConverter.convert(request.getStringData());
        }
        ResponseBody responseBody = new ResponseBody(request.getStringData());
        throw new ApiResponseStatusError(responseBody.getInt("code"), responseBody.optString("msg", ""), request.getHttpStatusCode(), responseBody);
    }

    @Override // com.kakao.network.NetworkService
    public <T> List<T> requestList(IRequest iRequest, ResponseStringConverter<T> responseStringConverter) {
        ResponseData request = new NetworkTask().request(iRequest);
        Logger.d(request.getStringData());
        if (request.getHttpStatusCode() == 200 || request.getHttpStatusCode() == 200) {
            return responseStringConverter.convertList(request.getStringData());
        }
        ResponseBody responseBody = new ResponseBody(request.getStringData());
        throw new ApiResponseStatusError(responseBody.getInt("code"), responseBody.optString("msg", ""), request.getHttpStatusCode(), responseBody);
    }

    @Override // com.kakao.network.NetworkService
    public <T> Future<T> request(final IRequest iRequest, final ResponseStringConverter<T> responseStringConverter, ResponseCallback<T> responseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<T>(responseCallback) {
            /* class com.kakao.network.DefaultNetworkService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34357);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public T call() {
                return (T) DefaultNetworkService.this.request(iRequest, responseStringConverter);
            }
        });
    }

    @Override // com.kakao.network.NetworkService
    public <T> Future<List<T>> requestList(final IRequest iRequest, final ResponseStringConverter<T> responseStringConverter, ResponseCallback<List<T>> responseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<List<T>>(responseCallback) {
            /* class com.kakao.network.DefaultNetworkService.AnonymousClass3 */

            static {
                Covode.recordClassIndex(34359);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public List<T> call() {
                return DefaultNetworkService.this.requestList(iRequest, responseStringConverter);
            }
        });
    }

    @Override // com.kakao.network.NetworkService
    public <T, E extends Exception> T request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter, CustomErrorConverter<E> customErrorConverter) {
        ResponseData request = new NetworkTask().request(iRequest);
        Logger.d(request.getStringData());
        if (request.getHttpStatusCode() == 200) {
            return responseStringConverter.convert(request.getStringData());
        }
        throw customErrorConverter.convert(request.getHttpStatusCode(), request.getStringData());
    }

    @Override // com.kakao.network.NetworkService
    public <T, E extends Exception> Future<T> request(final IRequest iRequest, final ResponseStringConverter<T> responseStringConverter, final CustomErrorConverter<E> customErrorConverter, ResponseCallback<T> responseCallback) {
        return this.taskQueue.addTask(new KakaoResultTask<T>(responseCallback) {
            /* class com.kakao.network.DefaultNetworkService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34358);
            }

            @Override // com.kakao.network.tasks.KakaoResultTask
            public T call() {
                return (T) DefaultNetworkService.this.request(iRequest, responseStringConverter, customErrorConverter);
            }
        });
    }
}
