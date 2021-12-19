package com.ss.android.ugc.aweme.shortvideo.publish;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.property.dx;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.utils.hx;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import h.z;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f129670a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.appcompat.app.d f129671b;

    /* renamed from: c  reason: collision with root package name */
    public final CommonSettingItemStatus f129672c;

    /* renamed from: d  reason: collision with root package name */
    public final VideoPublishEditModel f129673d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.g.c f129674e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.a<z> f129675f;

    /* renamed from: g  reason: collision with root package name */
    private final h f129676g = i.a((h.f.a.a) new C3380a(this));

    static {
        Covode.recordClassIndex(85120);
    }

    public final com.ss.android.ugc.aweme.shortvideo.view.a a() {
        return (com.ss.android.ugc.aweme.shortvideo.view.a) this.f129676g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a$a  reason: collision with other inner class name */
    static final class C3380a extends m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.view.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(85121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3380a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.view.a invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.view.a(this.this$0.f129671b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f129680a;

        static {
            Covode.recordClassIndex(85125);
        }

        c(a aVar) {
            this.f129680a = aVar;
        }

        public final void run() {
            final z.a aVar = new z.a();
            aVar.element = false;
            String str = this.f129680a.f129673d.mShootWay;
            String str2 = this.f129680a.f129673d.creationId;
            l.b(str2, "");
            com.ss.android.ugc.aweme.shortvideo.eventtrack.b.a(str, str2);
            this.f129680a.a().a(new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.a.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(85126);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    this.this$0.f129680a.f129670a = true;
                    this.this$0.f129680a.f129672c._checked.setValue(true);
                    aVar.element = true;
                    String str = this.this$0.f129680a.f129673d.mShootWay;
                    String str2 = this.this$0.f129680a.f129673d.creationId;
                    l.b(str2, "");
                    com.ss.android.ugc.aweme.shortvideo.eventtrack.b.b(str, str2);
                    return h.z.f158842a;
                }
            }, new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.a.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(85127);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    aVar.element = false;
                    String str = this.this$0.f129680a.f129673d.mShootWay;
                    String str2 = this.this$0.f129680a.f129673d.creationId;
                    l.b(str2, "");
                    com.ss.android.ugc.aweme.shortvideo.eventtrack.b.c(str, str2);
                    return h.z.f158842a;
                }
            }, new h.f.a.a<h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.a.c.AnonymousClass3 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(85128);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ h.z invoke() {
                    if (!aVar.element) {
                        String str = this.this$0.f129680a.f129673d.mShootWay;
                        String str2 = this.this$0.f129680a.f129673d.creationId;
                        l.b(str2, "");
                        com.ss.android.ugc.aweme.shortvideo.eventtrack.b.c(str, str2);
                    }
                    if (!this.this$0.f129680a.f129670a) {
                        this.this$0.f129680a.f129674e.f128528a.b(true);
                    } else {
                        hx.a(450, new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.shortvideo.publish.a.c.AnonymousClass3.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass3 this$0;

                            static {
                                Covode.recordClassIndex(85129);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* bridge */ /* synthetic */ h.z invoke() {
                                if (aVar.element) {
                                    this.this$0.this$0.f129680a.f129675f.invoke();
                                }
                                return h.z.f158842a;
                            }
                        });
                        hx.a((long) InteractFirstFrameTimeOutDurationSetting.DEFAULT, new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.shortvideo.publish.a.c.AnonymousClass3.AnonymousClass2 */
                            final /* synthetic */ AnonymousClass3 this$0;

                            static {
                                Covode.recordClassIndex(85130);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                this.this$0.this$0.f129680a.f129674e.f128528a.b(true);
                                return h.z.f158842a;
                            }
                        });
                    }
                    return h.z.f158842a;
                }
            });
            com.ss.android.ugc.aweme.cs.g.a.f79059a.storeBoolean("auto_pop_once_auto_caption_sheet", true);
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(85122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.b2z, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.a.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(85123);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.this$0.f129670a = true;
                    this.this$0.this$0.f129672c._checked.setValue(true);
                    String str = this.this$0.this$0.f129673d.mShootWay;
                    String str2 = this.this$0.this$0.f129673d.creationId;
                    l.b(str2, "");
                    com.ss.android.ugc.aweme.shortvideo.eventtrack.b.b(str, str2);
                    return h.z.f158842a;
                }
            });
            bVar2.b(R.string.b2y, new h.f.a.b<com.bytedance.tux.dialog.b.a, h.z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.publish.a.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(85124);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    String str = this.this$0.this$0.f129673d.mShootWay;
                    String str2 = this.this$0.this$0.f129673d.creationId;
                    l.b(str2, "");
                    com.ss.android.ugc.aweme.shortvideo.eventtrack.b.c(str, str2);
                    return h.z.f158842a;
                }
            });
            return h.z.f158842a;
        }
    }

    public final void a(int i2) {
        boolean z;
        boolean z2;
        if (!CrossLanguageUserExperiment.c().a() || this.f129673d.hasSubtitle()) {
            this.f129672c._visibility.setValue(8);
            return;
        }
        this.f129672c._visibility.setValue(0);
        if ((!this.f129673d.hasOriginalAudio() || this.f129673d.voiceVolume == 0.0f) && !this.f129673d.hasRecord()) {
            z = false;
        } else {
            z = true;
            if (i2 == 0) {
                z2 = false;
                this.f129672c._alpha.setValue(Float.valueOf(1.0f));
                this.f129672c._checked.setValue(Boolean.valueOf(this.f129670a));
                if (!this.f129670a && dx.b() && (true ^ com.ss.android.ugc.aweme.cs.g.a.f79059a.getBoolean("auto_pop_once_auto_caption_sheet", false))) {
                    this.f129674e.f128528a.b(false);
                    new Handler(Looper.getMainLooper()).post(new c(this));
                }
                this.f129672c.setOnClickListener(new d(this, z2, z, i2));
            }
        }
        z2 = true;
        this.f129672c._alpha.setValue(Float.valueOf(0.4f));
        this.f129672c._checked.setValue(false);
        this.f129672c.setOnClickListener(new d(this, z2, z, i2));
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<View, h.z> {
        final /* synthetic */ boolean $hasOriginalAudio;
        final /* synthetic */ boolean $isDisabled;
        final /* synthetic */ int $permission;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(85131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, boolean z, boolean z2, int i2) {
            super(1);
            this.this$0 = aVar;
            this.$isDisabled = z;
            this.$hasOriginalAudio = z2;
            this.$permission = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(View view) {
            boolean z;
            String str;
            if (!this.$isDisabled) {
                if (dx.c()) {
                    z = com.ss.android.ugc.aweme.cs.g.a.f79059a.getBoolean("auto_caption_sheet", false);
                } else if (dx.a() == dx.f118474a) {
                    z = false;
                } else {
                    z = com.ss.android.ugc.aweme.cs.g.a.f79059a.getBoolean("auto_caption_dialog", false);
                }
                String str2 = "";
                if (z || this.this$0.f129670a) {
                    a aVar = this.this$0;
                    aVar.f129670a = !aVar.f129670a;
                    this.this$0.f129672c._checked.setValue(Boolean.valueOf(!l.a((Object) this.this$0.f129672c._checked.getValue(), (Object) true)));
                    a aVar2 = this.this$0;
                    boolean a2 = l.a((Object) aVar2.f129672c._checked.getValue(), (Object) true);
                    com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "publish");
                    if (a2) {
                        str = "on";
                    } else {
                        str = "off";
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = a3.a("to_status", str);
                    String str3 = aVar2.f129673d.mShootWay;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    r.a("change_transl_auth_status", a4.a("shoot_way", str2).a("creation_id", aVar2.f129673d.creationId).f66730a);
                } else {
                    String str4 = this.this$0.f129673d.mShootWay;
                    String str5 = this.this$0.f129673d.creationId;
                    l.b(str5, str2);
                    com.ss.android.ugc.aweme.shortvideo.eventtrack.b.a(str4, str5);
                    if (dx.b()) {
                        final z.a aVar3 = new z.a();
                        aVar3.element = false;
                        this.this$0.a().a(new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.shortvideo.publish.a.d.AnonymousClass1 */
                            final /* synthetic */ d this$0;

                            static {
                                Covode.recordClassIndex(85132);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                this.this$0.this$0.f129670a = true;
                                this.this$0.this$0.f129672c._checked.setValue(true);
                                aVar3.element = true;
                                String str = this.this$0.this$0.f129673d.mShootWay;
                                String str2 = this.this$0.this$0.f129673d.creationId;
                                l.b(str2, "");
                                com.ss.android.ugc.aweme.shortvideo.eventtrack.b.b(str, str2);
                                return h.z.f158842a;
                            }
                        }, new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.shortvideo.publish.a.d.AnonymousClass2 */
                            final /* synthetic */ d this$0;

                            static {
                                Covode.recordClassIndex(85133);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                aVar3.element = true;
                                String str = this.this$0.this$0.f129673d.mShootWay;
                                String str2 = this.this$0.this$0.f129673d.creationId;
                                l.b(str2, "");
                                com.ss.android.ugc.aweme.shortvideo.eventtrack.b.c(str, str2);
                                return h.z.f158842a;
                            }
                        }, new h.f.a.a<h.z>(this) {
                            /* class com.ss.android.ugc.aweme.shortvideo.publish.a.d.AnonymousClass3 */
                            final /* synthetic */ d this$0;

                            static {
                                Covode.recordClassIndex(85134);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ h.z invoke() {
                                if (!aVar3.element) {
                                    String str = this.this$0.this$0.f129673d.mShootWay;
                                    String str2 = this.this$0.this$0.f129673d.creationId;
                                    l.b(str2, "");
                                    com.ss.android.ugc.aweme.shortvideo.eventtrack.b.c(str, str2);
                                }
                                return h.z.f158842a;
                            }
                        });
                        if (dx.c()) {
                            com.ss.android.ugc.aweme.cs.g.a.f79059a.storeBoolean("auto_caption_sheet", true);
                        }
                    } else {
                        a aVar4 = this.this$0;
                        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(aVar4.f129671b).a(R.string.b30).b(R.string.b2v), new b(aVar4)).a(false)).a().b().show();
                        com.ss.android.ugc.aweme.cs.g.a.f79059a.storeBoolean("auto_caption_dialog", true);
                    }
                }
            } else if (!this.$hasOriginalAudio) {
                new com.bytedance.tux.g.b(this.this$0.f129671b).a(this.this$0.f129671b.getResources().getString(R.string.b2h)).b();
            } else if (this.$permission != 0) {
                new com.bytedance.tux.g.b(this.this$0.f129671b).a(this.this$0.f129671b.getResources().getString(R.string.b2i)).b();
            }
            return h.z.f158842a;
        }
    }

    public a(androidx.appcompat.app.d dVar, CommonSettingItemStatus commonSettingItemStatus, VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.g.c cVar, h.f.a.a<h.z> aVar) {
        l.d(dVar, "");
        l.d(commonSettingItemStatus, "");
        l.d(videoPublishEditModel, "");
        l.d(cVar, "");
        l.d(aVar, "");
        this.f129671b = dVar;
        this.f129672c = commonSettingItemStatus;
        this.f129673d = videoPublishEditModel;
        this.f129674e = cVar;
        this.f129675f = aVar;
    }
}
