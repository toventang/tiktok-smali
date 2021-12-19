package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.a.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f126724a = new aa();

    private aa() {
    }

    static {
        Covode.recordClassIndex(83124);
    }

    /* access modifiers changed from: package-private */
    public static final class f implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f126725a;

        static {
            Covode.recordClassIndex(83136);
        }

        f(h.f.a.a aVar) {
            this.f126725a = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f126725a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<View, z> {
        final /* synthetic */ h.f.a.a $click2;

        static {
            Covode.recordClassIndex(83133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h.f.a.a aVar) {
            super(1);
            this.$click2 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$click2.invoke();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<View, z> {
        final /* synthetic */ h.f.a.a $click3;

        static {
            Covode.recordClassIndex(83134);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h.f.a.a aVar) {
            super(1);
            this.$click3 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$click3.invoke();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<View, z> {
        final /* synthetic */ h.f.a.a $click1;

        static {
            Covode.recordClassIndex(83135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(h.f.a.a aVar) {
            super(1);
            this.$click1 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            this.$click1.invoke();
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ String $button1Text;
        final /* synthetic */ String $button2Text;
        final /* synthetic */ boolean $destructive = true;
        final /* synthetic */ h.f.a.a $primaryAction;
        final /* synthetic */ h.f.a.a $secondaryAction;

        static {
            Covode.recordClassIndex(83125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, h.f.a.a aVar, String str2) {
            super(1);
            this.$button1Text = str;
            this.$primaryAction = aVar;
            this.$button2Text = str2;
            this.$secondaryAction = null;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            if (this.$destructive) {
                bVar2.c(this.$button1Text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.edit.aa.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(83126);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        l.d(aVar, "");
                        h.f.a.a aVar2 = this.this$0.$primaryAction;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        return z.f158842a;
                    }
                });
            } else {
                bVar2.a(this.$button1Text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.edit.aa.a.AnonymousClass2 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(83127);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        l.d(aVar, "");
                        h.f.a.a aVar2 = this.this$0.$primaryAction;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        return z.f158842a;
                    }
                });
            }
            bVar2.b(this.$button2Text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.aa.a.AnonymousClass3 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(83128);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    h.f.a.a aVar2 = this.this$0.$secondaryAction;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ int $button1Text = R.string.bcr;
        final /* synthetic */ int $button2Text;
        final /* synthetic */ boolean $destructive = false;
        final /* synthetic */ h.f.a.a $primaryAction;
        final /* synthetic */ h.f.a.a $secondaryAction;

        static {
            Covode.recordClassIndex(83129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.a aVar, h.f.a.a aVar2) {
            super(1);
            this.$primaryAction = aVar;
            this.$button2Text = R.string.bcq;
            this.$secondaryAction = aVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            if (this.$destructive) {
                bVar2.c(this.$button1Text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.edit.aa.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(83130);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        l.d(aVar, "");
                        h.f.a.a aVar2 = this.this$0.$primaryAction;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        return z.f158842a;
                    }
                });
            } else {
                bVar2.a(this.$button1Text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.edit.aa.b.AnonymousClass2 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(83131);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                        l.d(aVar, "");
                        h.f.a.a aVar2 = this.this$0.$primaryAction;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        return z.f158842a;
                    }
                });
            }
            bVar2.b(this.$button2Text, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.aa.b.AnonymousClass3 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(83132);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    h.f.a.a aVar2 = this.this$0.$secondaryAction;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static void a(Context context, String str, String str2, h.f.a.a<z> aVar, String str3) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(context).d(str), new a(str2, aVar, str3)).a().b().show();
    }

    public static void a(int i2, int i3, h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3, h.f.a.a<z> aVar4, boolean z, boolean z2, i iVar) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        l.d(aVar4, "");
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add(new a.e().a(R.string.bdd).b(0).a(new c(aVar2)));
            arrayList.add(new a.e().a(R.string.bda).b(0).a(new d(aVar3)));
        }
        if (z2) {
            a.e eVar = (a.e) new a.e().a(i2);
            eVar.f45258g = Integer.valueOf(i3);
            arrayList.add(eVar.b(0).a(new e(aVar)));
        }
        a.b bVar = new a.b();
        Object[] array = arrayList.toArray(new a.e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        a.e[] eVarArr = (a.e[]) array;
        bVar.a((a.e[]) Arrays.copyOf(eVarArr, eVarArr.length)).a(R.string.bd_).a(new f(aVar4)).b().show(iVar, "test");
    }
}
