package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.ArrayList;

public final class v implements u {

    /* renamed from: a  reason: collision with root package name */
    public static String f110820a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f110821b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<d> f110822c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private String f110823d;

    /* renamed from: e  reason: collision with root package name */
    private String f110824e;

    public static final class a {
        static {
            Covode.recordClassIndex(71110);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static u a(o oVar) {
            l.d(oVar, "");
            try {
                com.google.gson.l c2 = oVar.c("key");
                l.b(c2, "");
                String c3 = c2.c();
                com.google.gson.l c4 = oVar.c(StringSet.name);
                l.b(c4, "");
                String c5 = c4.c();
                l.b(c3, "");
                l.b(c5, "");
                return new v(c3, c5);
            } catch (Exception e2) {
                e2.getMessage();
                return null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.model.u
    public final String a() {
        return this.f110823d;
    }

    @Override // com.ss.android.ugc.aweme.model.u
    public final String b() {
        return this.f110824e;
    }

    @Override // com.ss.android.ugc.aweme.model.u
    public final ArrayList<d> c() {
        return this.f110822c;
    }

    static {
        Covode.recordClassIndex(71109);
        a aVar = new a((byte) 0);
        f110821b = aVar;
        f110820a = aVar.getClass().getSimpleName();
    }

    public v(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f110823d = str;
        this.f110824e = str2;
    }
}
