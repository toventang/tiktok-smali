package org.apache.http.params;

import com.bytedance.covode.number.Covode;
import java.util.Set;

public abstract class AbstractHttpParams implements HttpParams {
    static {
        Covode.recordClassIndex(106427);
    }

    protected AbstractHttpParams() {
    }

    public Set<String> getNames() {
        throw new UnsupportedOperationException();
    }

    public boolean isParameterTrue(String str) {
        return getBooleanParameter(str, false);
    }

    public boolean isParameterFalse(String str) {
        if (!getBooleanParameter(str, false)) {
            return true;
        }
        return false;
    }

    public boolean getBooleanParameter(String str, boolean z) {
        Object parameter = getParameter(str);
        if (parameter == null) {
            return z;
        }
        return ((Boolean) parameter).booleanValue();
    }

    public double getDoubleParameter(String str, double d2) {
        Object parameter = getParameter(str);
        if (parameter == null) {
            return d2;
        }
        return ((Double) parameter).doubleValue();
    }

    @Override // org.apache.http.params.HttpParams
    public int getIntParameter(String str, int i2) {
        Object parameter = getParameter(str);
        if (parameter == null) {
            return i2;
        }
        return ((Integer) parameter).intValue();
    }

    public long getLongParameter(String str, long j2) {
        Object parameter = getParameter(str);
        if (parameter == null) {
            return j2;
        }
        return ((Long) parameter).longValue();
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setBooleanParameter(String str, boolean z) {
        Boolean bool;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        setParameter(str, bool);
        return this;
    }

    public HttpParams setDoubleParameter(String str, double d2) {
        setParameter(str, new Double(d2));
        return this;
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setIntParameter(String str, int i2) {
        setParameter(str, new Integer(i2));
        return this;
    }

    public HttpParams setLongParameter(String str, long j2) {
        setParameter(str, new Long(j2));
        return this;
    }
}
