package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class AbsAdPopUpWebPageVM extends FeedBaseViewModel<a> {

    /* renamed from: k  reason: collision with root package name */
    public String f74135k;

    /* renamed from: l  reason: collision with root package name */
    public long f74136l;

    /* renamed from: m  reason: collision with root package name */
    public int f74137m = -1;

    static {
        Covode.recordClassIndex(45731);
    }

    public void h() {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new a();
    }

    static final class a extends m implements h.f.a.b<a, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f74138a = new a();

        static {
            Covode.recordClassIndex(45732);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, new com.bytedance.assem.arch.extensions.a(false), null, null, null, null, null, 62);
        }
    }

    public static final class b extends m implements h.f.a.b<a, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f74139a = new b();

        static {
            Covode.recordClassIndex(45733);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, new com.bytedance.assem.arch.extensions.a(true), null, null, null, null, null, 62);
        }
    }

    public static final class c extends m implements h.f.a.b<a, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f74140a = new c();

        static {
            Covode.recordClassIndex(45734);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, null, null, 61);
        }
    }

    static final class d extends m implements h.f.a.b<a, a> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f74141a = new d();

        static {
            Covode.recordClassIndex(45735);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ a invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            return a.a(aVar2, null, null, new com.bytedance.assem.arch.extensions.a(z.f158842a), null, null, null, 59);
        }
    }

    public static void a(long j2) {
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        dVar.a("duration", j2);
        r.a("h5_stay_time", dVar.f66730a);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }
}
