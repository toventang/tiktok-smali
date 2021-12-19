package org.apache.http.params;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BasicHttpParams extends AbstractHttpParams implements Serializable, Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    private final HashMap<String, Object> parameters = new HashMap<>();

    static {
        Covode.recordClassIndex(106428);
    }

    public void clear() {
        this.parameters.clear();
    }

    @Override // java.lang.Object
    public Object clone() {
        AbstractHttpParams abstractHttpParams = (AbstractHttpParams) super.clone();
        copyParams(abstractHttpParams);
        return abstractHttpParams;
    }

    public HttpParams copy() {
        try {
            return (HttpParams) clone();
        } catch (CloneNotSupportedException unused) {
            throw new UnsupportedOperationException("Cloning not supported");
        }
    }

    @Override // org.apache.http.params.AbstractHttpParams
    public Set<String> getNames() {
        return new HashSet(this.parameters.keySet());
    }

    @Override // org.apache.http.params.HttpParams
    public Object getParameter(String str) {
        return this.parameters.get(str);
    }

    public boolean isParameterSet(String str) {
        if (getParameter(str) != null) {
            return true;
        }
        return false;
    }

    public boolean isParameterSetLocally(String str) {
        if (this.parameters.get(str) != null) {
            return true;
        }
        return false;
    }

    public boolean removeParameter(String str) {
        if (!this.parameters.containsKey(str)) {
            return false;
        }
        this.parameters.remove(str);
        return true;
    }

    public void copyParams(HttpParams httpParams) {
        for (Map.Entry<String, Object> entry : this.parameters.entrySet()) {
            if (entry.getKey() instanceof String) {
                httpParams.setParameter(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // org.apache.http.params.HttpParams
    public HttpParams setParameter(String str, Object obj) {
        this.parameters.put(str, obj);
        return this;
    }

    public void setParameters(String[] strArr, Object obj) {
        for (String str : strArr) {
            setParameter(str, obj);
        }
    }
}
