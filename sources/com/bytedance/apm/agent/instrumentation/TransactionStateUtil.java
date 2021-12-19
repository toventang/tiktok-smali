package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

public class TransactionStateUtil {
    private static final AgentLog log = AgentLogManager.getAgentLog();

    static {
        Covode.recordClassIndex(14338);
    }

    public static void inspectAndInstrument(TransactionState transactionState, HttpURLConnection httpURLConnection) {
        transactionState.setUrl(httpURLConnection.getURL().toString());
        transactionState.setStartTime(System.currentTimeMillis());
        transactionState.setCarrier("");
    }

    public static void inspectAndInstrumentResponse(TransactionState transactionState, HttpURLConnection httpURLConnection) {
        int contentLength = httpURLConnection.getContentLength();
        if (contentLength >= 0) {
            transactionState.setBytesReceived((long) contentLength);
        }
        int i2 = 0;
        try {
            i2 = httpURLConnection.getResponseCode();
        } catch (IOException | NullPointerException unused) {
        }
        transactionState.setStatusCode(i2);
    }

    public static void setErrorCodeFromException(TransactionState transactionState, Exception exc) {
        if (exc instanceof UnknownHostException) {
            transactionState.setErrorCode(-10);
        } else if ((exc instanceof SocketTimeoutException) || (exc instanceof ConnectTimeoutException)) {
            transactionState.setErrorCode(-11);
        } else if (exc instanceof ConnectException) {
            transactionState.setErrorCode(-12);
        } else if (exc instanceof MalformedURLException) {
            transactionState.setErrorCode(-13);
        } else if (exc instanceof SSLException) {
            transactionState.setErrorCode(-14);
        } else {
            transactionState.setErrorCode(-1);
        }
    }
}
