package com.ss.ttuploader.net;

import android.os.Handler;
import com.bytedance.covode.number.Covode;

public class BaseDNS {
    protected boolean mCancelled;
    protected Handler mHandler;
    public String mHostname;
    public String mId;
    protected DNSCompletionListener mListener;
    protected TTVNetClient mNetClient;

    static {
        Covode.recordClassIndex(101413);
    }

    public void cancel() {
    }

    public void close() {
    }

    public boolean isRunning() {
        return true;
    }

    public void start() {
    }

    /* access modifiers changed from: protected */
    public void notifyCancelled() {
        this.mHandler.sendEmptyMessage(0);
    }

    public void setCompletionListener(DNSCompletionListener dNSCompletionListener) {
        this.mListener = dNSCompletionListener;
    }

    /* access modifiers changed from: protected */
    public void notifyError(TTUploadDNSInfo tTUploadDNSInfo) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, tTUploadDNSInfo));
    }

    /* access modifiers changed from: protected */
    public void notifyRetry(Error error) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    /* access modifiers changed from: protected */
    public void notifySuccess(TTUploadDNSInfo tTUploadDNSInfo) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, tTUploadDNSInfo));
    }

    public BaseDNS(String str, Handler handler) {
        this.mHostname = str;
        this.mHandler = handler;
        this.mId = Long.toString(System.nanoTime()) + Integer.toString(System.identityHashCode(this));
    }

    public BaseDNS(String str, TTVNetClient tTVNetClient, Handler handler) {
        this.mHostname = str;
        this.mHandler = handler;
        this.mNetClient = tTVNetClient == null ? new TTHTTPNetwork() : tTVNetClient;
        this.mId = Long.toString(System.nanoTime()) + Integer.toString(System.identityHashCode(this));
    }
}
