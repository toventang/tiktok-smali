package com.bytedance.android.live.effect;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.a.e;
import com.bytedance.android.live.effect.api.a.g;
import com.bytedance.android.live.effect.api.a.k;
import com.bytedance.android.live.effect.api.f;
import com.bytedance.android.live.effect.model.b;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final IEffectService f9746a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f9747b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static final h f9748c = i.a((h.f.a.a) a.f9749a);

    public static final f a() {
        return (f) f9748c.getValue();
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f9749a = new a();

        static {
            Covode.recordClassIndex(4965);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return d.f9746a.getLiveFilterManager();
        }
    }

    public static final v b() {
        v effectNewDialogFragment = f9746a.getEffectNewDialogFragment(null);
        l.b(effectNewDialogFragment, "");
        return effectNewDialogFragment;
    }

    public static final k c() {
        k liveEffectRestoreManager = f9746a.getLiveEffectRestoreManager();
        l.b(liveEffectRestoreManager, "");
        return liveEffectRestoreManager;
    }

    public static final com.bytedance.android.live.effect.api.a.h d() {
        com.bytedance.android.live.effect.api.a.h composerManager = f9746a.composerManager();
        l.b(composerManager, "");
        return composerManager;
    }

    public static final e e() {
        e baseComposerManager = f9746a.baseComposerManager();
        l.b(baseComposerManager, "");
        return baseComposerManager;
    }

    public static final com.bytedance.android.live.effect.api.e f() {
        com.bytedance.android.live.effect.api.e liveFilterHelper = f9746a.getLiveFilterHelper();
        l.b(liveFilterHelper, "");
        return liveFilterHelper;
    }

    public static final com.bytedance.android.live.effect.api.d g() {
        com.bytedance.android.live.effect.api.d effectLogHelper = f9746a.getEffectLogHelper();
        l.b(effectLogHelper, "");
        return effectLogHelper;
    }

    static {
        Covode.recordClassIndex(4964);
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IEffectService.class);
        l.b(a2, "");
        f9746a = (IEffectService) a2;
    }

    public static final v a(g gVar, b bVar) {
        l.d(gVar, "");
        v effectDialogFragment = f9746a.getEffectDialogFragment(gVar, bVar);
        l.b(effectDialogFragment, "");
        return effectDialogFragment;
    }
}
