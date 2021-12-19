package com.ss.android.ugc.aweme.ug.praise;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.ug.dynamicresource.c;
import com.ss.android.ugc.aweme.ug.praise.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f141965b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final a f141966a;

    static {
        Covode.recordClassIndex(92760);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92761);
        }

        private a() {
        }

        public static boolean a() {
            if (!com.ss.android.ugc.aweme.ug.e.a.a() || com.ss.android.ugc.aweme.ug.dynamicresource.d.a(c.a.f141783a, Bitmap.class) != null) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.b$b  reason: collision with other inner class name */
    public enum EnumC3781b {
        ACTIVATION("activation"),
        LIKE("like"),
        WALLPAPER("wallpaper");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(92762);
        }

        private EnumC3781b(String str) {
            this.value = str;
        }
    }

    public final void a() {
        MethodCollector.i(1106);
        ImageView imageView = new ImageView(this.f141966a.f141957c);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        String str = "";
        if (com.ss.android.ugc.aweme.ug.e.a.a()) {
            String str2 = c.a.f141783a;
            l.d(imageView, str);
            l.d(str2, str);
            Bitmap bitmap = (Bitmap) com.ss.android.ugc.aweme.ug.dynamicresource.d.a(str2, Bitmap.class);
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            }
        } else {
            imageView.setImageResource(2131234904);
        }
        com.bytedance.tux.dialog.b c2 = com.bytedance.tux.dialog.e.d.a(a.C1094a.a(this.f141966a.f141957c), imageView).b(this.f141966a.a().f141959a).d(this.f141966a.a().f141960b);
        String str3 = this.f141966a.a().f141961c;
        c cVar = new c(this);
        l.c(c2, str);
        com.bytedance.tux.dialog.a.d dVar = new com.bytedance.tux.dialog.a.d(c2.o);
        if (str3 != null) {
            str = str3;
        }
        dVar.a(str);
        cVar.invoke(dVar);
        c2.a(dVar);
        ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(c2, new d(this)).a(false)).a().b().show();
        MethodCollector.o(1106);
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.a.d, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92763);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a.d dVar) {
            com.bytedance.tux.dialog.a.d dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.b();
            dVar2.a(new h.f.a.b<com.bytedance.tux.dialog.a.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ug.praise.b.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(92764);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a.a aVar) {
                    com.bytedance.tux.dialog.a.a aVar2 = aVar;
                    l.d(aVar2, "");
                    a aVar3 = this.this$0.this$0.f141966a;
                    aVar3.a("rating_feedback");
                    aVar3.f141955a.a(true);
                    aVar3.c();
                    aVar2.a().dismiss();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(92765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(this.this$0.f141966a.a().f141962d, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ug.praise.b.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(92766);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    a aVar2 = this.this$0.this$0.f141966a;
                    aVar2.a("rating_submit");
                    aVar2.f141955a.b(true);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    try {
                        StringBuilder sb = new StringBuilder("market://details?id=");
                        a.C3779a aVar3 = aVar2.f141956b;
                        if (aVar3 == null) {
                            l.a("dialogContent");
                        }
                        intent.setData(Uri.parse(sb.append(aVar3.f141963e).toString()));
                        if (intent.resolveActivity(aVar2.f141957c.getPackageManager()) != null) {
                            a.a(aVar2.f141957c, intent);
                        } else {
                            StringBuilder sb2 = new StringBuilder("https://play.google.com/store/apps/details?id=");
                            a.C3779a aVar4 = aVar2.f141956b;
                            if (aVar4 == null) {
                                l.a("dialogContent");
                            }
                            intent.setData(Uri.parse(sb2.append(aVar4.f141963e).toString()));
                            if (intent.resolveActivity(aVar2.f141957c.getPackageManager()) != null) {
                                a.a(aVar2.f141957c, intent);
                            }
                        }
                    } catch (Exception unused) {
                        StringBuilder sb3 = new StringBuilder("https://play.google.com/store/apps/details?id=");
                        a.C3779a aVar5 = aVar2.f141956b;
                        if (aVar5 == null) {
                            l.a("dialogContent");
                        }
                        intent.setData(Uri.parse(sb3.append(aVar5.f141963e).toString()));
                        if (intent.resolveActivity(aVar2.f141957c.getPackageManager()) != null) {
                            a.a(aVar2.f141957c, intent);
                        }
                    }
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.a7u, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ug.praise.b.d.AnonymousClass2 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(92767);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.this$0.f141966a.a("rating_cancel");
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public b(a aVar) {
        l.d(aVar, "");
        this.f141966a = aVar;
        aVar.f141956b = aVar.b();
        aVar.a("rating_show");
        aVar.f141955a.a(System.currentTimeMillis());
        aVar.f141955a.a(String.valueOf(com.bytedance.ies.ugc.appcontext.d.e()));
    }
}
