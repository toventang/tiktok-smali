package com.bytedance.apm.agent.instrumentation.okhttp3;

import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import k.aa;
import k.f;
import k.h;
import k.l;
import k.q;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class InterceptorImpl implements Interceptor {
    static {
        Covode.recordClassIndex(14346);
    }

    class ResponseBodyWrapper extends ResponseBody {
        private h bufferedSource;
        private final Response response;
        private final ResponseBody responseBody;
        public long totalBytesRead;
        private final TransactionState transactionState;

        static {
            Covode.recordClassIndex(14347);
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.responseBody.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.responseBody.contentType();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, okhttp3.ResponseBody
        public void close() {
            this.responseBody.close();
            end();
        }

        public void end() {
            if (!this.transactionState.isComplete()) {
                this.transactionState.setBytesReceived(this.totalBytesRead);
                MonitorRecorder.reportMonitorData(this.transactionState, this.response);
            }
        }

        @Override // okhttp3.ResponseBody
        public h source() {
            if (this.bufferedSource == null) {
                this.bufferedSource = q.a(source(this.responseBody.source()));
            }
            return this.bufferedSource;
        }

        private aa source(aa aaVar) {
            return new l(aaVar) {
                /* class com.bytedance.apm.agent.instrumentation.okhttp3.InterceptorImpl.ResponseBodyWrapper.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14348);
                }

                @Override // k.aa, java.io.Closeable, k.l, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    ResponseBodyWrapper.this.end();
                }

                @Override // k.aa, k.l
                public long read(f fVar, long j2) {
                    long read = super.read(fVar, j2);
                    if (read >= 0) {
                        ResponseBodyWrapper.this.totalBytesRead += read;
                    }
                    return read;
                }
            };
        }

        public ResponseBodyWrapper(Response response2, TransactionState transactionState2) {
            this.response = response2;
            this.responseBody = response2.body();
            this.transactionState = transactionState2;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        String header = request.header("User-Agent");
        if (header != null && header.contains("tt")) {
            return chain.proceed(request);
        }
        TransactionState transactionState = new TransactionState();
        MonitorRecorder.recordRequest(request, transactionState);
        try {
            Response proceed = chain.proceed(request);
            MonitorRecorder.recordResponse(proceed, transactionState);
            if (transactionState.getReceivedBytes() >= 0 || TextUtils.isEmpty(proceed.header("Transfer-Encoding"))) {
                MonitorRecorder.reportMonitorData(transactionState, proceed);
                return proceed;
            }
            transactionState.addAssistData("Transfer-Encoding", proceed.header("Transfer-Encoding"));
            return proceed.newBuilder().body(new ResponseBodyWrapper(proceed, transactionState)).build();
        } catch (IOException e2) {
            MonitorRecorder.reportExceptionMonitor(transactionState, e2);
            throw e2;
        }
    }
}
