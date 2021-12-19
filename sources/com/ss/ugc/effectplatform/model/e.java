package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.f.b;
import com.ss.ugc.effectplatform.f.c;
import com.ss.ugc.effectplatform.f.d;
import com.ss.ugc.effectplatform.f.f;
import com.ss.ugc.effectplatform.f.g;
import d.a.d.a.j;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public int f153651a;

    /* renamed from: b  reason: collision with root package name */
    public String f153652b;

    /* renamed from: c  reason: collision with root package name */
    public Exception f153653c;

    /* renamed from: d  reason: collision with root package name */
    private String f153654d;

    /* renamed from: e  reason: collision with root package name */
    private String f153655e;

    /* renamed from: f  reason: collision with root package name */
    private String f153656f;

    static {
        Covode.recordClassIndex(102482);
    }

    public final String toString() {
        if (this.f153653c == null) {
            return "ExceptionResult{errorCode=" + this.f153651a + ", msg='" + this.f153652b + ", requestUrl='" + this.f153654d + '\'' + ", selectedHost='" + this.f153655e + '\'' + ", remoteIp='" + this.f153656f + '\'' + '}';
        }
        StringBuilder append = new StringBuilder("ExceptionResult{errorCode=").append(this.f153651a).append(", msg='").append(this.f153652b).append('\'').append(", requestUrl='").append(this.f153654d).append('\'').append(", selectedHost='").append(this.f153655e).append('\'').append(", remoteIp='").append(this.f153656f).append('\'').append(", exception=");
        Exception exc = this.f153653c;
        if (exc == null) {
            l.a();
        }
        return append.append(exc.getMessage()).append('}').toString();
    }

    public e(Exception exc) {
        this(exc, (byte) 0);
    }

    public e(int i2) {
        this.f153651a = -1;
        this.f153651a = i2;
        this.f153652b = com.ss.ugc.effectplatform.e.a(i2);
        this.f153653c = null;
    }

    public e(int i2, Exception exc) {
        this.f153651a = -1;
        this.f153651a = i2;
        this.f153652b = com.ss.ugc.effectplatform.e.a(i2);
        this.f153653c = exc;
    }

    private e(Exception exc, byte b2) {
        int i2;
        this.f153651a = -1;
        this.f153654d = null;
        this.f153655e = null;
        this.f153656f = null;
        this.f153653c = exc;
        if (exc instanceof d) {
            this.f153651a = ((d) exc).getStatus_code();
            this.f153652b = exc.getMessage();
        } else if (exc instanceof com.ss.ugc.effectplatform.f.e) {
            this.f153651a = ((com.ss.ugc.effectplatform.f.e) exc).getStatusCode();
            this.f153652b = exc.getMessage();
        } else if (exc instanceof b) {
            this.f153651a = 10008;
            this.f153652b = exc.getMessage();
        } else if (exc instanceof g) {
            this.f153651a = 10015;
            this.f153652b = exc.getMessage();
        } else if (exc instanceof f) {
            this.f153651a = 10013;
            this.f153652b = exc.getMessage();
        } else if (exc instanceof c) {
            this.f153651a = 10010;
            this.f153652b = exc.getMessage();
        } else if (exc instanceof j) {
            this.f153651a = 10012;
            this.f153652b = exc.getMessage();
        } else if (exc != null) {
            if (l.a((Object) "network unavailable", (Object) exc.getMessage())) {
                i2 = 10011;
            } else {
                i2 = 10005;
            }
            this.f153651a = i2;
            String message = exc.getMessage();
            this.f153652b = message;
            if (message == null || message.length() == 0) {
                this.f153652b = exc.toString();
            }
        } else {
            this.f153651a = 1;
            this.f153652b = com.ss.ugc.effectplatform.e.a(1);
        }
    }

    public final void a(String str, String str2, String str3) {
        this.f153654d = str;
        this.f153655e = str2;
        this.f153656f = str3;
    }
}
