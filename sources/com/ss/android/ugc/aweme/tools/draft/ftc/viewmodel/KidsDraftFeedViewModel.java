package com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.c.b;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.List;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class KidsDraftFeedViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public bz f139768a;

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.account.model.a> f139769b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<List<VideoPublishEditModel>> f139770c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final b f139771d;

    static {
        Covode.recordClassIndex(91358);
    }

    public KidsDraftFeedViewModel(b bVar) {
        l.d(bVar, "");
        this.f139771d = bVar;
    }

    public static final class a extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ KidsDraftFeedViewModel this$0;

        static {
            Covode.recordClassIndex(91359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(KidsDraftFeedViewModel kidsDraftFeedViewModel, d dVar) {
            super(2, dVar);
            this.this$0 = kidsDraftFeedViewModel;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                ah ahVar = bf.f159041b;
                AnonymousClass1 r1 = new m<am, d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftFeedViewModel.a.AnonymousClass1 */
                    Object L$0;
                    int label;
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(91360);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final d<z> create(Object obj, d<?> dVar) {
                        l.d(dVar, "");
                        return 
                    }
