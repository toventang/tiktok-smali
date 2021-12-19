package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import androidx.appcompat.app.AlertController;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class c extends h implements DialogInterface {

    /* renamed from: a  reason: collision with root package name */
    final AlertController f902a = new AlertController(getContext(), this, getWindow());

    static {
        Covode.recordClassIndex(250);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.a f903a;

        /* renamed from: b  reason: collision with root package name */
        private final int f904b;

        static {
            Covode.recordClassIndex(251);
        }

        public final c b() {
            c a2 = a();
            a2.show();
            return a2;
        }

        public final c a() {
            int i2;
            ListAdapter cVar;
            c cVar2 = new c(this.f903a.f865a, this.f904b);
            AlertController.a aVar = this.f903a;
            AlertController alertController = cVar2.f902a;
            if (aVar.f871g != null) {
                alertController.G = aVar.f871g;
            } else {
                if (aVar.f870f != null) {
                    alertController.a(aVar.f870f);
                }
                if (aVar.f868d != null) {
                    Drawable drawable = aVar.f868d;
                    alertController.C = drawable;
                    alertController.B = 0;
                    if (alertController.D != null) {
                        if (drawable != null) {
                            alertController.D.setVisibility(0);
                            alertController.D.setImageDrawable(drawable);
                        } else {
                            alertController.D.setVisibility(8);
                        }
                    }
                }
                if (aVar.f867c != 0) {
                    alertController.a(aVar.f867c);
                }
                if (aVar.f869e != 0) {
                    int i3 = aVar.f869e;
                    TypedValue typedValue = new TypedValue();
                    alertController.f837a.getTheme().resolveAttribute(i3, typedValue, true);
                    alertController.a(typedValue.resourceId);
                }
            }
            if (aVar.f872h != null) {
                CharSequence charSequence = aVar.f872h;
                alertController.f842f = charSequence;
                if (alertController.F != null) {
                    alertController.F.setText(charSequence);
                }
            }
            if (!(aVar.f873i == null && aVar.f874j == null)) {
                alertController.a(-1, aVar.f873i, aVar.f875k, null, aVar.f874j);
            }
            if (!(aVar.f876l == null && aVar.f877m == null)) {
                alertController.a(-2, aVar.f876l, aVar.n, null, aVar.f877m);
            }
            if (!(aVar.o == null && aVar.p == null)) {
                alertController.a(-3, aVar.o, aVar.q, null, aVar.p);
            }
            if (!(aVar.v == null && aVar.K == null && aVar.w == null)) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) aVar.f866b.inflate(alertController.L, (ViewGroup) null);
                if (!aVar.G) {
                    if (aVar.H) {
                        i2 = alertController.N;
                    } else {
                        i2 = alertController.O;
                    }
                    if (aVar.K != null) {
                        cVar = new SimpleCursorAdapter(aVar.f865a, i2, aVar.K, new String[]{aVar.L}, new int[]{16908308});
                    } else if (aVar.w != null) {
                        cVar = aVar.w;
                    } else {
                        cVar = new AlertController.c(aVar.f865a, i2, aVar.v);
                    }
                } else if (aVar.K == null) {
                    cVar = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ac: CONSTRUCTOR  (r11v5 'cVar' android.widget.ListAdapter) = 
                          (r4v0 'aVar' androidx.appcompat.app.AlertController$a)
                          (wrap: android.content.Context : 0x009b: IGET  (r7v3 android.content.Context) = (r4v0 'aVar' androidx.appcompat.app.AlertController$a) androidx.appcompat.app.AlertController.a.a android.content.Context)
                          (wrap: int : 0x009d: IGET  (r1v9 int) = (r14v0 'alertController' androidx.appcompat.app.AlertController) androidx.appcompat.app.AlertController.M int)
                          (wrap: java.lang.CharSequence[] : 0x009f: IGET  (r0v59 java.lang.CharSequence[]) = (r4v0 'aVar' androidx.appcompat.app.AlertController$a) androidx.appcompat.app.AlertController.a.v java.lang.CharSequence[])
                          (r9v2 'recycleListView' androidx.appcompat.app.AlertController$RecycleListView)
                         call: androidx.appcompat.app.AlertController.a.1.<init>(androidx.appcompat.app.AlertController$a, android.content.Context, int, java.lang.CharSequence[], androidx.appcompat.app.AlertController$RecycleListView):void type: CONSTRUCTOR in method: androidx.appcompat.app.c.a.a():androidx.appcompat.app.c, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.appcompat.app.AlertController, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 26 more
                        */
                    /*
                    // Method dump skipped, instructions count: 500
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.c.a.a():androidx.appcompat.app.c");
                }

                public final a a(DialogInterface.OnCancelListener onCancelListener) {
                    this.f903a.s = onCancelListener;
                    return this;
                }

                public final a b(CharSequence charSequence) {
                    this.f903a.f872h = charSequence;
                    return this;
                }

                public a(Context context) {
                    this(context, c.a(context, 0));
                }

                public final a a(int i2) {
                    AlertController.a aVar = this.f903a;
                    aVar.f870f = aVar.f865a.getText(R.string.di0);
                    return this;
                }

                public final a b(int i2) {
                    AlertController.a aVar = this.f903a;
                    aVar.f872h = aVar.f865a.getText(i2);
                    return this;
                }

                public final a a(CharSequence charSequence) {
                    this.f903a.f870f = charSequence;
                    return this;
                }

                public final a a(boolean z) {
                    this.f903a.r = z;
                    return this;
                }

                public final a c(int i2, DialogInterface.OnClickListener onClickListener) {
                    AlertController.a aVar = this.f903a;
                    aVar.o = aVar.f865a.getText(i2);
                    this.f903a.q = onClickListener;
                    return this;
                }

                public a(Context context, int i2) {
                    this.f903a = new AlertController.a(new ContextThemeWrapper(context, c.a(context, i2)));
                    this.f904b = i2;
                }

                public final a a(int i2, DialogInterface.OnClickListener onClickListener) {
                    AlertController.a aVar = this.f903a;
                    aVar.f873i = aVar.f865a.getText(i2);
                    this.f903a.f875k = onClickListener;
                    return this;
                }

                public final a b(int i2, DialogInterface.OnClickListener onClickListener) {
                    AlertController.a aVar = this.f903a;
                    aVar.f876l = aVar.f865a.getText(i2);
                    this.f903a.n = onClickListener;
                    return this;
                }

                public final a c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.f903a.o = charSequence;
                    this.f903a.q = onClickListener;
                    return this;
                }

                public final a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
                    this.f903a.w = listAdapter;
                    this.f903a.x = onClickListener;
                    return this;
                }

                public final a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.f903a.f876l = charSequence;
                    this.f903a.n = onClickListener;
                    return this;
                }

                public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.f903a.f873i = charSequence;
                    this.f903a.f875k = onClickListener;
                    return this;
                }

                public final a a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
                    this.f903a.v = charSequenceArr;
                    this.f903a.x = onClickListener;
                    return this;
                }
            }

            @Override // androidx.appcompat.app.h, android.app.Dialog
            public void setTitle(CharSequence charSequence) {
                super.setTitle(charSequence);
                this.f902a.a(charSequence);
            }

            public final Button a(int i2) {
                AlertController alertController = this.f902a;
                if (i2 == -3) {
                    return alertController.w;
                }
                if (i2 == -2) {
                    return alertController.s;
                }
                if (i2 != -1) {
                    return null;
                }
                return alertController.o;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
                if (androidx.appcompat.app.AlertController.a(r12) == false) goto L_0x004f;
             */
            /* JADX WARNING: Removed duplicated region for block: B:101:0x0213  */
            /* JADX WARNING: Removed duplicated region for block: B:130:0x0289  */
            /* JADX WARNING: Removed duplicated region for block: B:133:0x0297  */
            /* JADX WARNING: Removed duplicated region for block: B:137:0x02a9  */
            /* JADX WARNING: Removed duplicated region for block: B:138:0x02ac  */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
            /* JADX WARNING: Removed duplicated region for block: B:156:0x0343  */
            /* JADX WARNING: Removed duplicated region for block: B:157:0x0348  */
            /* JADX WARNING: Removed duplicated region for block: B:160:0x0356  */
            /* JADX WARNING: Removed duplicated region for block: B:162:0x0370  */
            /* JADX WARNING: Removed duplicated region for block: B:165:0x037d  */
            /* JADX WARNING: Removed duplicated region for block: B:169:0x03a2  */
            /* JADX WARNING: Removed duplicated region for block: B:175:0x03ee  */
            /* JADX WARNING: Removed duplicated region for block: B:183:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x00c8  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x0154  */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x0158  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x0166  */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x0181  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x0184  */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x0191  */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x0194  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x01b8  */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x01d9  */
            @Override // androidx.appcompat.app.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCreate(android.os.Bundle r16) {
                /*
                // Method dump skipped, instructions count: 1037
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.c.onCreate(android.os.Bundle):void");
            }

            public c(Context context, int i2) {
                super(context, a(context, i2));
            }

            static int a(Context context, int i2) {
                if (((i2 >>> 24) & 255) > 0) {
                    return i2;
                }
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.i8, typedValue, true);
                return typedValue.resourceId;
            }

            public boolean onKeyDown(int i2, KeyEvent keyEvent) {
                AlertController alertController = this.f902a;
                if (alertController.A == null || !alertController.A.a(keyEvent)) {
                    return super.onKeyDown(i2, keyEvent);
                }
                return true;
            }

            public boolean onKeyUp(int i2, KeyEvent keyEvent) {
                AlertController alertController = this.f902a;
                if (alertController.A == null || !alertController.A.a(keyEvent)) {
                    return super.onKeyUp(i2, keyEvent);
                }
                return true;
            }
        }
