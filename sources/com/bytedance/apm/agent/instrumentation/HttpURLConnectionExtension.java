package com.bytedance.apm.agent.instrumentation;

import com.bytedance.apm.agent.instrumentation.io.CountingInputStream;
import com.bytedance.apm.agent.instrumentation.io.CountingOutputStream;
import com.bytedance.apm.agent.instrumentation.io.StreamCompleteEvent;
import com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener;
import com.bytedance.apm.agent.instrumentation.okhttp3.MonitorRecorder;
import com.bytedance.apm.agent.instrumentation.transaction.TransactionState;
import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

public class HttpURLConnectionExtension extends HttpURLConnection {
    private static final AgentLog log = AgentLogManager.getAgentLog();
    public HttpURLConnection impl;
    private TransactionState transactionState;

    public boolean getAllowUserInteraction() {
        return this.impl.getAllowUserInteraction();
    }

    public int getConnectTimeout() {
        return this.impl.getConnectTimeout();
    }

    public boolean getDefaultUseCaches() {
        return this.impl.getDefaultUseCaches();
    }

    public boolean getDoInput() {
        return this.impl.getDoInput();
    }

    public boolean getDoOutput() {
        return this.impl.getDoOutput();
    }

    public boolean getInstanceFollowRedirects() {
        return this.impl.getInstanceFollowRedirects();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.impl.getPermission();
    }

    public int getReadTimeout() {
        return this.impl.getReadTimeout();
    }

    public String getRequestMethod() {
        return this.impl.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.impl.getRequestProperties();
    }

    public URL getURL() {
        return this.impl.getURL();
    }

    public boolean getUseCaches() {
        return this.impl.getUseCaches();
    }

    public String toString() {
        return this.impl.toString();
    }

    public boolean usingProxy() {
        return this.impl.usingProxy();
    }

    static {
        Covode.recordClassIndex(14327);
    }

    @Override // java.net.URLConnection
    public void connect() {
        getTransactionState();
        try {
            this.impl.connect();
        } catch (IOException e2) {
            error(e2);
            throw e2;
        }
    }

    public String getContentEncoding() {
        getTransactionState();
        String contentEncoding = this.impl.getContentEncoding();
        checkResponse();
        return contentEncoding;
    }

    public int getContentLength() {
        getTransactionState();
        int contentLength = this.impl.getContentLength();
        checkResponse();
        return contentLength;
    }

    public String getContentType() {
        getTransactionState();
        String contentType = this.impl.getContentType();
        checkResponse();
        return contentType;
    }

    public long getDate() {
        getTransactionState();
        long date = this.impl.getDate();
        checkResponse();
        return date;
    }

    public long getExpiration() {
        getTransactionState();
        long expiration = this.impl.getExpiration();
        checkResponse();
        return expiration;
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        getTransactionState();
        Map<String, List<String>> headerFields = this.impl.getHeaderFields();
        checkResponse();
        return headerFields;
    }

    public long getIfModifiedSince() {
        getTransactionState();
        long ifModifiedSince = this.impl.getIfModifiedSince();
        checkResponse();
        return ifModifiedSince;
    }

    public long getLastModified() {
        getTransactionState();
        long lastModified = this.impl.getLastModified();
        checkResponse();
        return lastModified;
    }

    private void checkResponse() {
        if (!getTransactionState().isComplete()) {
            TransactionStateUtil.inspectAndInstrumentResponse(getTransactionState(), this.impl);
        }
    }

    private TransactionState getTransactionState() {
        if (this.transactionState == null) {
            TransactionState transactionState2 = new TransactionState();
            this.transactionState = transactionState2;
            TransactionStateUtil.inspectAndInstrument(transactionState2, this.impl);
        }
        return this.transactionState;
    }

    public void disconnect() {
        TransactionState transactionState2 = this.transactionState;
        if (transactionState2 != null && !transactionState2.isComplete()) {
            addTransactionAndErrorData(this.transactionState);
        }
        this.impl.disconnect();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        final TransactionState transactionState2 = getTransactionState();
        try {
            CountingOutputStream countingOutputStream = new CountingOutputStream(this.impl.getOutputStream());
            countingOutputStream.addStreamCompleteListener(new StreamCompleteListener() {
                /* class com.bytedance.apm.agent.instrumentation.HttpURLConnectionExtension.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(14329);
                }

                @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener
                public void streamError(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState2.isComplete()) {
                        transactionState2.setBytesSent(streamCompleteEvent.getBytes());
                    }
                    HttpURLConnectionExtension.this.error(streamCompleteEvent.getException());
                }

                @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener
                public void streamComplete(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState2.isComplete()) {
                        String requestProperty = HttpURLConnectionExtension.this.impl.getRequestProperty("content-length");
                        long bytes = streamCompleteEvent.getBytes();
                        if (requestProperty != null) {
                            try {
                                bytes = Long.parseLong(requestProperty);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        transactionState2.setBytesSent(bytes);
                        HttpURLConnectionExtension.this.addTransactionAndErrorData(transactionState2);
                    }
                }
            });
            return countingOutputStream;
        } catch (IOException e2) {
            error(e2);
            throw e2;
        }
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        getTransactionState();
        try {
            int responseCode = this.impl.getResponseCode();
            checkResponse();
            return responseCode;
        } catch (IOException e2) {
            error(e2);
            throw e2;
        }
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        getTransactionState();
        try {
            String responseMessage = this.impl.getResponseMessage();
            checkResponse();
            return responseMessage;
        } catch (IOException e2) {
            error(e2);
            throw e2;
        }
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        getTransactionState();
        try {
            Object content = this.impl.getContent();
            int contentLength = this.impl.getContentLength();
            if (contentLength >= 0) {
                TransactionState transactionState2 = getTransactionState();
                if (!transactionState2.isComplete()) {
                    transactionState2.setBytesReceived((long) contentLength);
                    addTransactionAndErrorData(transactionState2);
                }
            }
            return content;
        } catch (IOException e2) {
            error(e2);
            throw e2;
        }
    }

    public InputStream getErrorStream() {
        getTransactionState();
        try {
            return new CountingInputStream(this.impl.getErrorStream(), true);
        } catch (Exception e2) {
            log.error(e2.toString());
            return this.impl.getErrorStream();
        }
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        final TransactionState transactionState2 = getTransactionState();
        try {
            CountingInputStream countingInputStream = new CountingInputStream(this.impl.getInputStream());
            TransactionStateUtil.inspectAndInstrumentResponse(transactionState2, this.impl);
            countingInputStream.addStreamCompleteListener(new StreamCompleteListener() {
                /* class com.bytedance.apm.agent.instrumentation.HttpURLConnectionExtension.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(14328);
                }

                @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener
                public void streamError(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState2.isComplete()) {
                        transactionState2.setBytesReceived(streamCompleteEvent.getBytes());
                    }
                    HttpURLConnectionExtension.this.error(streamCompleteEvent.getException());
                }

                @Override // com.bytedance.apm.agent.instrumentation.io.StreamCompleteListener
                public void streamComplete(StreamCompleteEvent streamCompleteEvent) {
                    if (!transactionState2.isComplete()) {
                        long contentLength = (long) HttpURLConnectionExtension.this.impl.getContentLength();
                        long bytes = streamCompleteEvent.getBytes();
                        if (contentLength < 0) {
                            contentLength = bytes;
                        }
                        transactionState2.setBytesReceived(contentLength);
                        HttpURLConnectionExtension.this.addTransactionAndErrorData(transactionState2);
                    }
                }
            });
            return countingInputStream;
        } catch (IOException e2) {
            error(e2);
            throw e2;
        }
    }

    public void addTransactionAndErrorData(TransactionState transactionState2) {
        MonitorRecorder.reportMonitorData(transactionState2, "httpurlconnection");
    }

    public String getRequestProperty(String str) {
        return this.impl.getRequestProperty(str);
    }

    public void setAllowUserInteraction(boolean z) {
        this.impl.setAllowUserInteraction(z);
    }

    public void setChunkedStreamingMode(int i2) {
        this.impl.setChunkedStreamingMode(i2);
    }

    public void setConnectTimeout(int i2) {
        this.impl.setConnectTimeout(i2);
    }

    public void setDefaultUseCaches(boolean z) {
        this.impl.setDefaultUseCaches(z);
    }

    public void setDoInput(boolean z) {
        this.impl.setDoInput(z);
    }

    public void setDoOutput(boolean z) {
        this.impl.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i2) {
        this.impl.setFixedLengthStreamingMode(i2);
    }

    public void setIfModifiedSince(long j2) {
        this.impl.setIfModifiedSince(j2);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.impl.setInstanceFollowRedirects(z);
    }

    public void setReadTimeout(int i2) {
        this.impl.setReadTimeout(i2);
    }

    public void setUseCaches(boolean z) {
        this.impl.setUseCaches(z);
    }

    public HttpURLConnectionExtension(HttpURLConnection httpURLConnection) {
        super(httpURLConnection.getURL());
        this.impl = httpURLConnection;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i2) {
        getTransactionState();
        String headerField = this.impl.getHeaderField(i2);
        checkResponse();
        return headerField;
    }

    public String getHeaderFieldKey(int i2) {
        getTransactionState();
        String headerFieldKey = this.impl.getHeaderFieldKey(i2);
        checkResponse();
        return headerFieldKey;
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        getTransactionState();
        try {
            this.impl.setRequestMethod(str);
        } catch (ProtocolException e2) {
            error(e2);
            throw e2;
        }
    }

    public void error(Exception exc) {
        TransactionState transactionState2 = getTransactionState();
        TransactionStateUtil.setErrorCodeFromException(transactionState2, exc);
        if (!transactionState2.isComplete()) {
            TransactionStateUtil.inspectAndInstrumentResponse(transactionState2, this.impl);
            MonitorRecorder.reportMonitorData(transactionState2, "httpurlconnection");
        }
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        getTransactionState();
        try {
            Object content = this.impl.getContent(clsArr);
            checkResponse();
            return content;
        } catch (IOException e2) {
            error(e2);
            throw e2;
        }
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        getTransactionState();
        String headerField = this.impl.getHeaderField(str);
        checkResponse();
        return headerField;
    }

    public void addRequestProperty(String str, String str2) {
        this.impl.addRequestProperty(str, str2);
    }

    public void setRequestProperty(String str, String str2) {
        this.impl.setRequestProperty(str, str2);
    }

    public long getHeaderFieldDate(String str, long j2) {
        getTransactionState();
        long headerFieldDate = this.impl.getHeaderFieldDate(str, j2);
        checkResponse();
        return headerFieldDate;
    }

    public int getHeaderFieldInt(String str, int i2) {
        getTransactionState();
        int headerFieldInt = this.impl.getHeaderFieldInt(str, i2);
        checkResponse();
        return headerFieldInt;
    }
}
