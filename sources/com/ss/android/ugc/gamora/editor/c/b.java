package com.ss.android.ugc.gamora.editor.c;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.a.m;
import h.f.b.l;
import h.z;

public abstract class b<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(95721);
    }

    private b() {
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    public static final class a extends b<z> {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f145706a;

        static {
            Covode.recordClassIndex(95722);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super((byte) 0);
            l.d(activity, "");
            this.f145706a = activity;
        }
    }

    public static final class d extends b<z> {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f145714a;

        /* renamed from: b  reason: collision with root package name */
        public final RetakeVideoContext f145715b;

        static {
            Covode.recordClassIndex(95725);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Activity activity, RetakeVideoContext retakeVideoContext) {
            super((byte) 0);
            l.d(activity, "");
            l.d(retakeVideoContext, "");
            this.f145714a = activity;
            this.f145715b = retakeVideoContext;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.c.b$b  reason: collision with other inner class name */
    public static final class C3871b extends b<z> {

        /* renamed from: a  reason: collision with root package name */
        public final VideoPublishEditModel f145707a;

        /* renamed from: b  reason: collision with root package name */
        public final h.f.a.b<String, z> f145708b;

        /* renamed from: c  reason: collision with root package name */
        public final m<String, DraftSaveResult, z> f145709c;

        static {
            Covode.recordClassIndex(95723);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.m<? super java.lang.String, ? super com.ss.android.ugc.aweme.draft.model.DraftSaveResult, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3871b(VideoPublishEditModel videoPublishEditModel, h.f.a.b<? super String, z> bVar, m<? super String, ? super DraftSaveResult, z> mVar) {
            super((byte) 0);
            l.d(videoPublishEditModel, "");
            l.d(bVar, "");
            l.d(mVar, "");
            this.f145707a = videoPublishEditModel;
            this.f145708b = bVar;
            this.f145709c = mVar;
        }
    }

    public static final class e extends b<z> {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f145716a;

        /* renamed from: b  reason: collision with root package name */
        public final Intent f145717b;

        /* renamed from: c  reason: collision with root package name */
        public final VideoPublishEditModel f145718c;

        static {
            Covode.recordClassIndex(95726);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(Activity activity, Intent intent, VideoPublishEditModel videoPublishEditModel) {
            super((byte) 0);
            l.d(activity, "");
            l.d(intent, "");
            l.d(videoPublishEditModel, "");
            this.f145716a = activity;
            this.f145717b = intent;
            this.f145718c = videoPublishEditModel;
        }
    }

    public static final class c extends b<Intent> {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f145710a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f145711b;

        /* renamed from: c  reason: collision with root package name */
        public final Activity f145712c;

        /* renamed from: d  reason: collision with root package name */
        public final Intent f145713d;

        static {
            Covode.recordClassIndex(95724);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z, boolean z2, Activity activity, Intent intent) {
            super((byte) 0);
            l.d(activity, "");
            l.d(intent, "");
            this.f145710a = z;
            this.f145711b = z2;
            this.f145712c = activity;
            this.f145713d = intent;
        }
    }
}
