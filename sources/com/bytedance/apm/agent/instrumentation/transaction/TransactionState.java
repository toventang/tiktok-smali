package com.bytedance.apm.agent.instrumentation.transaction;

import com.bytedance.apm.agent.logging.AgentLog;
import com.bytedance.apm.agent.logging.AgentLogManager;
import com.bytedance.apm.q.v;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class TransactionState {
    private static final AgentLog LOG = AgentLogManager.getAgentLog();
    private long bytesReceived;
    private long bytesSent;
    private String carrier = "unknown";
    private long endTime;
    private int errorCode;
    private JSONObject extraData = new JSONObject();
    private String httpMethod;
    private String rawUrl;
    private long startTime;
    private State state = State.READY;
    private int statusCode;
    private TransactionData transactionData;
    private String url;
    private String wanType = "unknown";

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final long getReceivedBytes() {
        return this.bytesReceived;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrl() {
        return this.url;
    }

    static {
        Covode.recordClassIndex(14361);
    }

    public final boolean isComplete() {
        if (this.state.ordinal() >= State.COMPLETE.ordinal()) {
            return true;
        }
        return false;
    }

    public final boolean isSent() {
        if (this.state.ordinal() >= State.SENT.ordinal()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public enum State {
        READY,
        SENT,
        COMPLETE;

        static {
            Covode.recordClassIndex(14362);
        }
    }

    public final TransactionData end() {
        addAssistData("startTime", new StringBuilder().append(this.startTime).toString());
        if (!isComplete()) {
            this.state = State.COMPLETE;
            this.endTime = System.currentTimeMillis();
        }
        return toTransactionData();
    }

    private TransactionData toTransactionData() {
        if (!isComplete()) {
            LOG.warning("toTransactionData() called on incomplete TransactionState");
        }
        if (this.url == null) {
            LOG.error("Attempted to convert TransactionData TransactionState instance with no URL into TransactionData TransactionData");
            return null;
        }
        if (this.transactionData == null) {
            TransactionData transactionData2 = new TransactionData(this.url, this.carrier, this.endTime - this.startTime, this.statusCode, this.errorCode, this.bytesSent, this.bytesReceived, this.wanType, this.httpMethod, this.extraData);
            this.transactionData = transactionData2;
            transactionData2.setRequestEnd(this.endTime);
            this.transactionData.setErrorCode(this.errorCode);
        }
        return this.transactionData;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" StartTime ").append(String.valueOf(this.startTime)).append(" BytesReceived ").append(String.valueOf(this.bytesReceived)).append(" BytesSent ").append(String.valueOf(this.bytesSent)).append(" Url ").append(this.url);
        return sb.toString();
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setBytesReceived(long j2) {
        if (!isComplete()) {
            this.bytesReceived = j2;
        } else {
            LOG.warning("setBytesReceived(...) called on TransactionState in " + this.state.toString() + " state");
        }
    }

    public final void setBytesSent(long j2) {
        if (!isComplete()) {
            this.bytesSent = j2;
            this.state = State.SENT;
            return;
        }
        LOG.warning("setBytesSent(...) called on TransactionState in " + this.state.toString() + " state");
    }

    public final void setCarrier(String str) {
        if (!isSent()) {
            this.carrier = str;
        } else {
            LOG.warning("setCarrier(...) called on TransactionState in " + this.state.toString() + " state");
        }
    }

    public final void setErrorCode(int i2) {
        if (!isComplete()) {
            this.errorCode = i2;
            return;
        }
        TransactionData transactionData2 = this.transactionData;
        if (transactionData2 != null) {
            transactionData2.setErrorCode(i2);
        }
        LOG.warning("setErrorCode(...) called on TransactionState in " + this.state.toString() + " state");
    }

    public final void setMethod(String str) {
        if (!isSent()) {
            this.httpMethod = str;
        } else {
            LOG.warning("setHttpMethod(...) called on TransactionState in " + this.state.toString() + " state");
        }
    }

    public final void setStatusCode(int i2) {
        if (!isComplete()) {
            this.statusCode = i2;
            return;
        }
        if (this.statusCode == 0 && i2 != 0) {
            this.statusCode = i2;
        }
        LOG.warning("setStatusCode(...) called on TransactionState in " + this.state.toString() + " state");
    }

    public final void setUrl(String str) {
        if (this.rawUrl == null) {
            this.rawUrl = str;
        }
        String a2 = v.a(str);
        if (a2 != null) {
            if (!isSent()) {
                this.url = a2;
            } else {
                LOG.warning("setUrl(...) called on TransactionState in " + this.state.toString() + " state");
            }
        }
    }

    public final void setWanType(String str) {
        if (!isSent()) {
            this.wanType = str;
        } else {
            LOG.warning("setWanType(...) called on TransactionState in " + this.state.toString() + " state");
        }
    }

    public final void addAssistData(String str, String str2) {
        if (isComplete()) {
            LOG.warning("addAssistData(...) called on TransactionState in " + this.state.toString() + " state");
        }
        try {
            this.extraData.put(str, str2);
        } catch (JSONException e2) {
            LOG.error("Caught error while addAssistData: ", e2);
        }
    }
}
