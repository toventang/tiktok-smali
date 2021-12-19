package com.bytedance.sdk.bridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f43825a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.sdk.bridge.api.a f43826b;

    /* renamed from: c  reason: collision with root package name */
    public Context f43827c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f43828d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f43829e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f43830f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f43831g;

    static {
        Covode.recordClassIndex(26799);
    }

    public final Boolean a() {
        boolean booleanValue;
        Boolean bool = this.f43828d;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }

    public final Boolean b() {
        boolean booleanValue;
        Boolean bool = this.f43831g;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }

    /* renamed from: com.bytedance.sdk.bridge.a$a  reason: collision with other inner class name */
    public static class C1065a {

        /* renamed from: a  reason: collision with root package name */
        private String f43832a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f43833b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f43834c = true;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f43835d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f43836e;

        /* renamed from: f  reason: collision with root package name */
        private com.bytedance.sdk.bridge.api.a f43837f;

        /* renamed from: g  reason: collision with root package name */
        private Context f43838g;

        static {
            Covode.recordClassIndex(26800);
        }

        public final a a() {
            return new a(this.f43833b, this.f43832a, this.f43834c, this.f43835d, this.f43836e, this.f43837f, this.f43838g, (byte) 0);
        }

        public final C1065a a(Boolean bool) {
            this.f43833b = bool;
            return this;
        }

        public final C1065a b(Boolean bool) {
            this.f43834c = bool;
            return this;
        }

        public final C1065a c(Boolean bool) {
            this.f43835d = bool;
            return this;
        }

        public final C1065a d(Boolean bool) {
            this.f43836e = bool;
            return this;
        }

        public final C1065a a(String str) {
            this.f43832a = str;
            return this;
        }
    }

    private a(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, com.bytedance.sdk.bridge.api.a aVar, Context context) {
        this.f43828d = bool;
        this.f43825a = str;
        this.f43829e = bool2;
        this.f43830f = bool3;
        this.f43831g = bool4;
        this.f43826b = aVar;
        this.f43827c = context;
    }

    /* synthetic */ a(Boolean bool, String str, Boolean bool2, Boolean bool3, Boolean bool4, com.bytedance.sdk.bridge.api.a aVar, Context context, byte b2) {
        this(bool, str, bool2, bool3, bool4, aVar, context);
    }
}
