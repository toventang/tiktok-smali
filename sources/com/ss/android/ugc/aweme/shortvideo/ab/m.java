package com.ss.android.ugc.aweme.shortvideo.ab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;
import h.z;

public abstract class m<RETURN_VALUE> {
    static {
        Covode.recordClassIndex(82037);
    }

    private m() {
    }

    public /* synthetic */ m(byte b2) {
        this();
    }

    public static final class a extends m<z> {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f124865a;

        static {
            Covode.recordClassIndex(82038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super((byte) 0);
            l.d(activity, "");
            this.f124865a = activity;
        }
    }

    public static final class b extends m<Intent> {

        /* renamed from: a  reason: collision with root package name */
        public final e f124866a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f124867b;

        /* renamed from: c  reason: collision with root package name */
        public final String f124868c;

        static {
            Covode.recordClassIndex(82039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, Bundle bundle, String str) {
            super((byte) 0);
            l.d(eVar, "");
            l.d(bundle, "");
            this.f124866a = eVar;
            this.f124867b = bundle;
            this.f124868c = str;
        }
    }

    public static final class c extends m<z> {

        /* renamed from: a  reason: collision with root package name */
        public final com.ss.android.ugc.aweme.draft.model.c f124869a;

        /* renamed from: b  reason: collision with root package name */
        public final int f124870b;

        /* renamed from: c  reason: collision with root package name */
        public final VideoPublishEditModel f124871c;

        /* renamed from: d  reason: collision with root package name */
        public final IDraftService.DraftSaveListener f124872d;

        static {
            Covode.recordClassIndex(82040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.ss.android.ugc.aweme.draft.model.c cVar, int i2, VideoPublishEditModel videoPublishEditModel, IDraftService.DraftSaveListener draftSaveListener) {
            super((byte) 0);
            l.d(cVar, "");
            l.d(videoPublishEditModel, "");
            l.d(draftSaveListener, "");
            this.f124869a = cVar;
            this.f124870b = i2;
            this.f124871c = videoPublishEditModel;
            this.f124872d = draftSaveListener;
        }
    }
}
