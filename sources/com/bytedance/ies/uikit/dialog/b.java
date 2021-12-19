package com.bytedance.ies.uikit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.uikit.dialog.a;
import com.zhiliaoapp.musically.R;

public final class b extends Dialog implements DialogInterface {

    /* renamed from: b  reason: collision with root package name */
    public static AbstractC0807b f35468b;

    /* renamed from: a  reason: collision with root package name */
    public a f35469a = new a(getContext(), this, getWindow());

    /* renamed from: com.bytedance.ies.uikit.dialog.b$b  reason: collision with other inner class name */
    public interface AbstractC0807b {
        static {
            Covode.recordClassIndex(21206);
        }
    }

    static {
        Covode.recordClassIndex(21204);
    }

    static int a(int i2) {
        return i2 == 1 ? R.style.hj : i2 == 2 ? R.style.hk : i2 >= 16777216 ? i2 : R.style.hj;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final a.C0806a f35470a;

        /* renamed from: b  reason: collision with root package name */
        private int f35471b;

        static {
            Covode.recordClassIndex(21205);
        }

        public final a a() {
            this.f35470a.o = true;
            return this;
        }

        public final b c() {
            b b2 = b();
            b2.show();
            return b2;
        }

        public final b b() {
            int i2;
            ListAdapter simpleCursorAdapter;
            MethodCollector.i(11292);
            b bVar = new b(this.f35470a.f35442a, this.f35471b);
            a.C0806a aVar = this.f35470a;
            a aVar2 = bVar.f35469a;
            if (aVar.f35448g != null) {
                aVar2.C = aVar.f35448g;
            } else {
                if (aVar.f35447f != null) {
                    aVar2.a(aVar.f35447f);
                }
                if (aVar.f35445d != null) {
                    Drawable drawable = aVar.f35445d;
                    aVar2.y = drawable;
                    aVar2.x = 0;
                    if (aVar2.z != null) {
                        if (drawable != null) {
                            aVar2.z.setImageDrawable(drawable);
                        } else {
                            aVar2.z.setVisibility(8);
                        }
                    }
                }
                if (aVar.f35444c != 0) {
                    aVar2.a(aVar.f35444c);
                }
                if (aVar.f35446e != 0) {
                    int i3 = aVar.f35446e;
                    TypedValue typedValue = new TypedValue();
                    aVar2.f35417a.getTheme().resolveAttribute(i3, typedValue, true);
                    aVar2.a(typedValue.resourceId);
                }
            }
            if (aVar.f35449h != null) {
                CharSequence charSequence = aVar.f35449h;
                aVar2.f35421e = charSequence;
                if (aVar2.B != null) {
                    aVar2.B.setText(charSequence);
                }
            }
            if (aVar.f35450i != null) {
                aVar2.a(-1, aVar.f35450i, aVar.f35451j, null);
            }
            if (aVar.f35452k != null) {
                aVar2.a(-2, aVar.f35452k, aVar.f35453l, null);
            }
            if (aVar.f35454m != null) {
                aVar2.a(-3, aVar.f35454m, aVar.n, null);
            }
            if (aVar.K) {
                aVar2.D = true;
            }
            if (!(aVar.s == null && aVar.H == null && aVar.t == null)) {
                RecycleListView recycleListView = (RecycleListView) aVar.f35443b.inflate(aVar2.I, (ViewGroup) null);
                if (!aVar.D) {
                    if (aVar.E) {
                        i2 = aVar2.K;
                    } else {
                        i2 = aVar2.L;
                    }
                    if (aVar.H != null) {
                        simpleCursorAdapter = new SimpleCursorAdapter(aVar.f35442a, i2, aVar.H, new String[]{aVar.I}, new int[]{R.id.eiz});
                    } else if (aVar.t != null) {
                        simpleCursorAdapter = aVar.t;
                    } else {
                        simpleCursorAdapter = new a.c(aVar.f35442a, i2, aVar.s);
                    }
                } else if (aVar.H == null) {
                    simpleCursorAdapter = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x008a: CONSTRUCTOR  (r14v6 'simpleCursorAdapter' android.widget.ListAdapter) = 
                          (r15v0 'aVar' com.bytedance.ies.uikit.dialog.a$a)
                          (wrap: android.content.Context : 0x007c: IGET  (r2v3 android.content.Context) = (r15v0 'aVar' com.bytedance.ies.uikit.dialog.a$a) com.bytedance.ies.uikit.dialog.a.a.a android.content.Context)
                          (wrap: int : 0x007e: IGET  (r1v9 int) = (r5v0 'aVar2' com.bytedance.ies.uikit.dialog.a) com.bytedance.ies.uikit.dialog.a.J int)
                          (wrap: java.lang.CharSequence[] : 0x0080: IGET  (r0v60 java.lang.CharSequence[]) = (r15v0 'aVar' com.bytedance.ies.uikit.dialog.a$a) com.bytedance.ies.uikit.dialog.a.a.s java.lang.CharSequence[])
                          (r11v1 'recycleListView' com.bytedance.ies.uikit.dialog.RecycleListView)
                         call: com.bytedance.ies.uikit.dialog.a.a.1.<init>(com.bytedance.ies.uikit.dialog.a$a, android.content.Context, int, java.lang.CharSequence[], com.bytedance.ies.uikit.dialog.RecycleListView):void type: CONSTRUCTOR in method: com.bytedance.ies.uikit.dialog.b.a.b():com.bytedance.ies.uikit.dialog.b, file: classes10.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.ies.uikit.dialog.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 26 more
                        */
                    /*
                    // Method dump skipped, instructions count: 468
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.dialog.b.a.b():com.bytedance.ies.uikit.dialog.b");
                }

                public a(Context context) {
                    this(context, 0);
                }

                public final a b(CharSequence charSequence) {
                    this.f35470a.f35449h = charSequence;
                    return this;
                }

                public final a a(int i2) {
                    a.C0806a aVar = this.f35470a;
                    aVar.f35449h = aVar.f35442a.getText(i2);
                    return this;
                }

                public final a c(CharSequence charSequence) {
                    this.f35470a.f35452k = charSequence;
                    this.f35470a.f35453l = null;
                    return this;
                }

                public final a a(CharSequence charSequence) {
                    this.f35470a.f35447f = charSequence;
                    return this;
                }

                public a(Context context, int i2) {
                    this.f35470a = new a.C0806a(new ContextThemeWrapper(context, b.a(i2)));
                    this.f35471b = i2;
                }

                public final a a(int i2, DialogInterface.OnClickListener onClickListener) {
                    a.C0806a aVar = this.f35470a;
                    aVar.f35450i = aVar.f35442a.getText(i2);
                    this.f35470a.f35451j = onClickListener;
                    return this;
                }

                public final a a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                    this.f35470a.f35450i = charSequence;
                    this.f35470a.f35451j = onClickListener;
                    return this;
                }

                public final a a(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
                    this.f35470a.s = charSequenceArr;
                    this.f35470a.u = onClickListener;
                    return this;
                }
            }

            @Override // android.app.Dialog
            public final void setTitle(CharSequence charSequence) {
                super.setTitle(charSequence);
                this.f35469a.a(charSequence);
            }

            /* access modifiers changed from: protected */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x0164, code lost:
                if (com.bytedance.ies.uikit.dialog.a.a(r10) == false) goto L_0x0166;
             */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x011c  */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x015b  */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x015f  */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x0186  */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x0195  */
            /* JADX WARNING: Removed duplicated region for block: B:55:0x01a0  */
            /* JADX WARNING: Removed duplicated region for block: B:65:0x01be  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x01e5  */
            /* JADX WARNING: Removed duplicated region for block: B:80:0x01f1  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x0222  */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x0227  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onCreate(android.os.Bundle r16) {
                /*
                // Method dump skipped, instructions count: 839
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.dialog.b.onCreate(android.os.Bundle):void");
            }

            public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                a aVar = this.f35469a;
                if (aVar.w == null || !aVar.w.executeKeyEvent(keyEvent)) {
                    return super.onKeyDown(i2, keyEvent);
                }
                return true;
            }

            public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
                a aVar = this.f35469a;
                if (aVar.w == null || !aVar.w.executeKeyEvent(keyEvent)) {
                    return super.onKeyUp(i2, keyEvent);
                }
                return true;
            }

            protected b(Context context, int i2) {
                super(context, a(i2));
                if (f35468b == null) {
                    throw new IllegalArgumentException("NightMode is NUll");
                }
            }
        }
