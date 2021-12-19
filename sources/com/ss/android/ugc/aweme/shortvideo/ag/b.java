package com.ss.android.ugc.aweme.shortvideo.ag;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.di;
import h.f.b.m;
import h.h;
import h.i;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final h f124945a = i.a((h.f.a.a) a.f124947a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f124946b = i.a((h.f.a.a) C3262b.f124948a);

    static final class a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124947a = new a();

        static {
            Covode.recordClassIndex(82082);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String str = di.f126461d + "water" + File.separatorChar;
            com.ss.android.ugc.tools.utils.i.a(str, false);
            return str;
        }
    }

    static {
        Covode.recordClassIndex(82081);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ag.b$b  reason: collision with other inner class name */
    static final class C3262b extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3262b f124948a = new C3262b();

        static {
            Covode.recordClassIndex(82083);
        }

        C3262b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String str = ((String) b.f124945a.getValue()) + "mask" + File.separatorChar;
            com.ss.android.ugc.tools.utils.i.a(str, false);
            return str;
        }
    }
}
