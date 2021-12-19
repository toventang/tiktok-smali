package com.bytedance.android.live.network;

import com.bytedance.android.live.e;
import com.bytedance.android.live.network.gson.BaseListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.BaseResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ResponseTypeAdapter;
import com.bytedance.android.live.network.response.b;
import com.bytedance.android.live.network.response.c;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import h.f.b.m;
import h.h;
import java.lang.reflect.Type;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f12125a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final h f12126b = h.i.a((h.f.a.a) a.f12127a);

    public static f a() {
        return (f) f12126b.getValue();
    }

    private i() {
    }

    static {
        Covode.recordClassIndex(6638);
    }

    static final class a extends m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12127a = new a();

        static {
            Covode.recordClassIndex(6639);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            f fVar = e.a.f9628b;
            return e.a.f9627a.a((Type) b.class, (Object) new BaseResponseTypeAdapter(fVar)).a((Type) d.class, (Object) new ResponseTypeAdapter(fVar)).a((Type) com.bytedance.android.live.network.response.a.class, (Object) new BaseListResponseTypeAdapter(fVar)).a((Type) c.class, (Object) new ListResponseTypeAdapter(fVar)).b();
        }
    }
}
