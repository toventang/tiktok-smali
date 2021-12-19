package com.kakao.network;

import com.bytedance.covode.number.Covode;
import com.kakao.network.callback.ResponseCallback;
import com.kakao.network.response.CustomErrorConverter;
import com.kakao.network.response.ResponseStringConverter;
import com.kakao.network.tasks.KakaoTaskQueue;
import java.util.List;
import java.util.concurrent.Future;

public interface NetworkService {
    static {
        Covode.recordClassIndex(34364);
    }

    <T> T request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter);

    <T, E extends Exception> T request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter, CustomErrorConverter<E> customErrorConverter);

    <T> Future<T> request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter, ResponseCallback<T> responseCallback);

    <T, E extends Exception> Future<T> request(IRequest iRequest, ResponseStringConverter<T> responseStringConverter, CustomErrorConverter<E> customErrorConverter, ResponseCallback<T> responseCallback);

    <T> List<T> requestList(IRequest iRequest, ResponseStringConverter<T> responseStringConverter);

    <T> Future<List<T>> requestList(IRequest iRequest, ResponseStringConverter<T> responseStringConverter, ResponseCallback<List<T>> responseCallback);

    public static class Factory {
        static {
            Covode.recordClassIndex(34365);
        }

        public static NetworkService getInstance() {
            return new DefaultNetworkService(KakaoTaskQueue.getInstance());
        }
    }
}
