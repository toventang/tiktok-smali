package com.ss.android.ugc.aweme.ftc;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.b.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.utils.hz;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.File;
import java.util.Objects;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f97391a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(61864);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.a$a  reason: collision with other inner class name */
    public static final class C2343a extends m implements b<Boolean, Boolean> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $enterFrom;

        static {
            Covode.recordClassIndex(61865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2343a(String str, Context context) {
            super(1);
            this.$enterFrom = str;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            boolean z = false;
            if (bool.booleanValue()) {
                if (TextUtils.equals("share_to_tt", this.$enterFrom)) {
                    if (!g.a().A().a() && hz.a()) {
                        if (TextUtils.equals("US", g.a().y().a())) {
                            ((com.bytedance.tux.dialog.b) c.a(new com.bytedance.tux.dialog.b(this.$context).b(this.$context.getResources().getString(R.string.fvt)).d(this.$context.getResources().getString(R.string.fvs)), new b<com.bytedance.tux.dialog.b.b, z>(this) {
                                /* class com.ss.android.ugc.aweme.ftc.a.C2343a.AnonymousClass1 */
                                final /* synthetic */ C2343a this$0;

                                static {
                                    Covode.recordClassIndex(61866);
                                }

                                {
                                    this.this$0 = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // h.f.a.b
                                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                                    com.bytedance.tux.dialog.b.b bVar2 = bVar;
                                    l.d(bVar2, "");
                                    String string = this.this$0.$context.getResources().getString(R.string.fvr);
                                    l.b(string, "");
                                    bVar2.a(string, new b<com.bytedance.tux.dialog.b.a, z>(this) {
                                        /* class com.ss.android.ugc.aweme.ftc.a.C2343a.AnonymousClass1.AnonymousClass1 */
                                        final /* synthetic */ AnonymousClass1 this$0;

                                        static {
                                            Covode.recordClassIndex(61867);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // h.f.a.b
                                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                            l.d(aVar, "");
                                            Context context = this.this$0.this$0.$context;
                                            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                                            ((Activity) context).finish();
                                            return z.f158842a;
                                        }
                                    });
                                    return z.f158842a;
                                }
                            }).a(false)).a().b().show();
                        } else {
                            ((com.bytedance.tux.dialog.b) c.a(new com.bytedance.tux.dialog.b(this.$context).b(this.$context.getResources().getString(R.string.fvq)).d(this.$context.getResources().getString(R.string.fvo) + "\n" + this.$context.getResources().getString(R.string.fvp)), new b<com.bytedance.tux.dialog.b.b, z>(this) {
                                /* class com.ss.android.ugc.aweme.ftc.a.C2343a.AnonymousClass2 */
                                final /* synthetic */ C2343a this$0;

                                static {
                                    Covode.recordClassIndex(61868);
                                }

                                {
                                    this.this$0 = r2;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // h.f.a.b
                                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                                    com.bytedance.tux.dialog.b.b bVar2 = bVar;
                                    l.d(bVar2, "");
                                    String string = this.this$0.$context.getResources().getString(R.string.fvn);
                                    l.b(string, "");
                                    bVar2.a(string, new b<com.bytedance.tux.dialog.b.a, z>(this) {
                                        /* class com.ss.android.ugc.aweme.ftc.a.C2343a.AnonymousClass2.AnonymousClass1 */
                                        final /* synthetic */ AnonymousClass2 this$0;

                                        static {
                                            Covode.recordClassIndex(61869);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                        @Override // h.f.a.b
                                        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                            l.d(aVar, "");
                                            Context context = this.this$0.this$0.$context;
                                            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                                            ((Activity) context).finish();
                                            return z.f158842a;
                                        }
                                    });
                                    return z.f158842a;
                                }
                            }).a(false)).a().b().show();
                        }
                        r.a("show_u13_video_import_error", new com.ss.android.ugc.tools.f.b().a("enter_from", "share_to_tt").f149193a);
                    }
                } else if (!g.a().A().a() && hz.a()) {
                    r.a("show_u13_video_import_error", new com.ss.android.ugc.tools.f.b().a("enter_from", this.$enterFrom).f149193a);
                    if (TextUtils.equals("US", g.a().y().a())) {
                        c.a(new com.bytedance.tux.dialog.b(this.$context).b(this.$context.getResources().getString(R.string.hc9)).d(this.$context.getResources().getString(R.string.hc8)), new b<com.bytedance.tux.dialog.b.b, z>(this) {
                            /* class com.ss.android.ugc.aweme.ftc.a.C2343a.AnonymousClass3 */
                            final /* synthetic */ C2343a this$0;

                            static {
                                Covode.recordClassIndex(61870);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                                com.bytedance.tux.dialog.b.b bVar2 = bVar;
                                l.d(bVar2, "");
                                String string = this.this$0.$context.getResources().getString(R.string.hc7);
                                l.b(string, "");
                                bVar2.a(string, AnonymousClass1.f97392a);
                                return z.f158842a;
                            }
                        }).a().b().show();
                    } else {
                        c.a(new com.bytedance.tux.dialog.b(this.$context).b(this.$context.getResources().getString(R.string.hc6)).d(this.$context.getResources().getString(R.string.hc4) + "\n " + this.$context.getResources().getString(R.string.hc5)), new b<com.bytedance.tux.dialog.b.b, z>(this) {
                            /* class com.ss.android.ugc.aweme.ftc.a.C2343a.AnonymousClass4 */
                            final /* synthetic */ C2343a this$0;

                            static {
                                Covode.recordClassIndex(61872);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                                com.bytedance.tux.dialog.b.b bVar2 = bVar;
                                l.d(bVar2, "");
                                String string = this.this$0.$context.getResources().getString(R.string.hc3);
                                l.b(string, "");
                                bVar2.a(string, AnonymousClass1.f97393a);
                                return z.f158842a;
                            }
                        }).a().b().show();
                    }
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    private static boolean a(String str, b<? super Boolean, Boolean> bVar) {
        String str2;
        l.d(bVar, "");
        x xVar = new x(new File(com.ss.android.ugc.asve.a.b().getFilesDir(), "kmVideo").getPath());
        String[] strArr = new String[1];
        int i2 = 0;
        do {
            strArr[0] = str;
            i2++;
        } while (i2 <= 0);
        xVar.a(strArr, (String[]) null, (String[]) null, x.l.VIDEO_OUT_RATIO_ORIGINAL);
        try {
            String a2 = xVar.a("com.android.information");
            if (a2 == null || a2.length() == 0) {
                str2 = xVar.a("com.apple.quicktime.information");
            } else {
                str2 = xVar.a("com.android.information");
            }
            if (str2 == null || str2.length() == 0) {
                return bVar.invoke(false).booleanValue();
            }
            JSONObject jSONObject = new JSONObject(str2);
            if (!jSONObject.has("com.bytedance.info") || !new JSONObject(jSONObject.get("com.bytedance.info").toString()).has("is_km_video")) {
                return bVar.invoke(false).booleanValue();
            }
            return bVar.invoke(true).booleanValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            xVar.j();
            return bVar.invoke(false).booleanValue();
        }
    }

    public static boolean a(Context context, String str, String str2) {
        l.d(context, "");
        l.d(str2, "");
        return a(str, new C2343a(str2, context));
    }
}
