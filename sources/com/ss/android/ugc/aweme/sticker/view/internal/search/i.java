package com.ss.android.ugc.aweme.sticker.view.internal.search;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.repository.a.d;
import com.ss.android.ugc.aweme.sticker.repository.a.f;
import com.ss.android.ugc.aweme.sticker.repository.a.g;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class i implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f136567b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final int f136568c;

    /* renamed from: d  reason: collision with root package name */
    private final EffectCategoryModel f136569d = g.a(b.f136573a);

    /* renamed from: e  reason: collision with root package name */
    private final List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> f136570e;

    /* renamed from: f  reason: collision with root package name */
    private final d f136571f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f136572g;

    static {
        Covode.recordClassIndex(89197);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final void e() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89198);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final int a() {
        return this.f136568c;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final EffectCategoryModel b() {
        return this.f136569d;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final List<com.ss.android.ugc.aweme.sticker.repository.d.a.a> c() {
        return this.f136570e;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.f
    public final d d() {
        return this.f136571f;
    }

    static final class b extends m implements h.f.a.b<EffectCategoryModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f136573a = new b();

        static {
            Covode.recordClassIndex(89199);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(EffectCategoryModel effectCategoryModel) {
            EffectCategoryModel effectCategoryModel2 = effectCategoryModel;
            l.d(effectCategoryModel2, "");
            effectCategoryModel2.setId("0");
            effectCategoryModel2.setKey("sticker_category:search");
            effectCategoryModel2.setName("Search");
            return z.f158842a;
        }
    }

    public i(Context context) {
        l.d(context, "");
        this.f136572g = context;
    }
}
