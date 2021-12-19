package org.apache.http.params;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SyncBasicHttpParams extends BasicHttpParams {
    private static final long serialVersionUID = 5387834869062660642L;

    static {
        Covode.recordClassIndex(106432);
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized void clear() {
        MethodCollector.i(13763);
        super.clear();
        MethodCollector.o(13763);
    }

    @Override // org.apache.http.params.BasicHttpParams, java.lang.Object
    public synchronized Object clone() {
        Object clone;
        MethodCollector.i(13764);
        clone = super.clone();
        MethodCollector.o(13764);
        return clone;
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public synchronized Object getParameter(String str) {
        Object parameter;
        MethodCollector.i(13565);
        parameter = super.getParameter(str);
        MethodCollector.o(13565);
        return parameter;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized boolean isParameterSet(String str) {
        boolean isParameterSet;
        MethodCollector.i(13568);
        isParameterSet = super.isParameterSet(str);
        MethodCollector.o(13568);
        return isParameterSet;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized boolean isParameterSetLocally(String str) {
        boolean isParameterSetLocally;
        MethodCollector.i(13635);
        isParameterSetLocally = super.isParameterSetLocally(str);
        MethodCollector.o(13635);
        return isParameterSetLocally;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized boolean removeParameter(String str) {
        boolean removeParameter;
        MethodCollector.i(13403);
        removeParameter = super.removeParameter(str);
        MethodCollector.o(13403);
        return removeParameter;
    }

    @Override // org.apache.http.params.BasicHttpParams, org.apache.http.params.HttpParams
    public synchronized HttpParams setParameter(String str, Object obj) {
        HttpParams parameter;
        MethodCollector.i(13497);
        parameter = super.setParameter(str, obj);
        MethodCollector.o(13497);
        return parameter;
    }

    @Override // org.apache.http.params.BasicHttpParams
    public synchronized void setParameters(String[] strArr, Object obj) {
        MethodCollector.i(13761);
        super.setParameters(strArr, obj);
        MethodCollector.o(13761);
    }
}
