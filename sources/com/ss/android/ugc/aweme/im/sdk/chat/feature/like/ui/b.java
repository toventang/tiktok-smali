package com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.google.gson.a.c;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f100888a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f100889b = i.a((h.f.a.a) a.f100890a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.ui.b$b  reason: collision with other inner class name */
    public static final class C2500b {
        @c(a = "required_min_version")

        /* renamed from: a  reason: collision with root package name */
        public int f100891a = 180100;

        static {
            Covode.recordClassIndex(64542);
        }
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f100890a = new a();

        static {
            Covode.recordClassIndex(64541);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.f101904a.b(new C2500b());
        }
    }

    static {
        Covode.recordClassIndex(64540);
    }

    public static String a(ai aiVar) {
        l.d(aiVar, "");
        if (aiVar.getMsgType() != 5) {
            return "";
        }
        String str = (String) f100889b.getValue();
        l.b(str, "");
        return str;
    }
}
