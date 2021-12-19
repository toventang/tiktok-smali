package com.twitter.sdk.android.core.services.a;

import com.bytedance.covode.number.Covode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final double f156185a;

    /* renamed from: b  reason: collision with root package name */
    public final double f156186b;

    /* renamed from: c  reason: collision with root package name */
    public final int f156187c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC4120a f156188d;

    static {
        Covode.recordClassIndex(103736);
    }

    /* renamed from: com.twitter.sdk.android.core.services.a.a$a  reason: collision with other inner class name */
    public enum EnumC4120a {
        MILES("mi"),
        KILOMETERS("km");
        
        public final String identifier;

        static {
            Covode.recordClassIndex(103737);
        }

        private EnumC4120a(String str) {
            this.identifier = str;
        }
    }

    public String toString() {
        return this.f156185a + "," + this.f156186b + "," + this.f156187c + this.f156188d.identifier;
    }
}
