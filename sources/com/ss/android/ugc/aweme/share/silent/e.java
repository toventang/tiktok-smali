package com.ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.a;
import com.ss.android.ugc.aweme.share.silent.a.c;
import com.ss.android.ugc.aweme.share.silent.a.d;
import com.ss.android.ugc.aweme.share.silent.a.g;
import com.ss.android.ugc.aweme.share.silent.a.h;
import com.ss.android.ugc.aweme.share.silent.a.i;
import com.ss.android.ugc.aweme.share.silent.t;
import com.ss.android.ugc.aweme.sharer.b;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.j.f;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import h.f.b.l;
import h.f.b.z;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f124336a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f124337b = new a((byte) 0);

    static {
        Covode.recordClassIndex(81639);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81640);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.silent.e$a$a  reason: collision with other inner class name */
        public static final class C3240a implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f124338a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f124339b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AVUploadSaveModel f124340c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Activity f124341d;

            static {
                Covode.recordClassIndex(81641);
            }

            public C3240a(f fVar, c cVar, AVUploadSaveModel aVUploadSaveModel, Activity activity) {
                this.f124338a = fVar;
                this.f124339b = cVar;
                this.f124340c = aVUploadSaveModel;
                this.f124341d = activity;
            }

            public final void onDismiss() {
                com.ss.android.ugc.aweme.share.silent.a.a eVar;
                ai aiVar = this.f124338a.f128584h;
                Objects.requireNonNull(aiVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse");
                Aweme aweme = ((CreateAwemeResponse) aiVar).aweme;
                l.b(aweme, "");
                c cVar = this.f124339b;
                String str = this.f124340c.getLocalFinalPath().toString();
                Activity activity = this.f124341d;
                l.d(aweme, "");
                l.d(cVar, "");
                l.d(str, "");
                l.d(activity, "");
                b a2 = a.C3201a.a(cVar.getKey(), activity);
                if (a2 != null) {
                    z.e eVar2 = new z.e();
                    eVar2.element = "";
                    l.d(cVar, "");
                    l.d(a2, "");
                    switch (d.f124300a[cVar.ordinal()]) {
                        case 1:
                            eVar = new com.ss.android.ugc.aweme.share.silent.a.e(a2);
                            break;
                        case 2:
                            eVar = new com.ss.android.ugc.aweme.share.silent.a.f(a2);
                            break;
                        case 3:
                            eVar = new i(a2);
                            break;
                        case 4:
                            eVar = new g(a2);
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            eVar = new c(a2);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            eVar = new h(a2);
                            break;
                        default:
                            eVar = new com.ss.android.ugc.aweme.share.silent.a.b(a2);
                            break;
                    }
                    eVar.a(activity, str, new com.ss.android.ugc.aweme.share.model.c(cVar, "", eVar2.element, aweme), new t.a.d(eVar2));
                }
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
