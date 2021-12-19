package com.ss.android.ugc.aweme.sharer.ui.b;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f124608a = new a((byte) 0);

    static {
        Covode.recordClassIndex(81883);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81884);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.sharer.ui.b.b$a$a  reason: collision with other inner class name */
        public static final class C3257a extends BottomSheetBehavior.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.google.android.material.bottomsheet.a f124609a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ BottomSheetBehavior f124610b;

            static {
                Covode.recordClassIndex(81885);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
            public final void a(View view, float f2) {
                l.d(view, "");
            }

            C3257a(com.google.android.material.bottomsheet.a aVar, BottomSheetBehavior bottomSheetBehavior) {
                this.f124609a = aVar;
                this.f124610b = bottomSheetBehavior;
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
            public final void a(View view, int i2) {
                l.d(view, "");
                if (i2 == 5) {
                    this.f124609a.cancel();
                    this.f124610b.c(4);
                }
            }
        }

        private static void a(Window window, int i2) {
            String str = Build.MANUFACTURER + "-" + Build.MODEL;
            if (TextUtils.equals("vivo-V1821A", str) || TextUtils.equals("vivo-V1821T", str)) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-1, i2);
            }
        }

        private static void b(com.google.android.material.bottomsheet.a aVar, View view) {
            WindowManager.LayoutParams attributes;
            ViewParent parent = view.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior a2 = BottomSheetBehavior.a((View) parent);
            if (a2 != null) {
                Window window = aVar.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    a2.b(attributes.height);
                } else {
                    return;
                }
            }
            l.b(a2, "");
            a2.c(3);
            a2.o = new C3257a(aVar, a2);
        }

        public static void a(com.google.android.material.bottomsheet.a aVar, View view) {
            l.d(aVar, "");
            l.d(view, "");
            Context context = aVar.getContext();
            l.b(context, "");
            Window window = aVar.getWindow();
            int b2 = n.b(context) - n.e(context);
            if (window != null) {
                if (b2 == 0) {
                    b2 = -1;
                }
                a(window, b2);
                b(aVar, view);
                window.setGravity(80);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                window.setAttributes(attributes);
                window.findViewById(R.id.akq).setBackgroundDrawable(new ColorDrawable(0));
                aVar.setCanceledOnTouchOutside(true);
            }
        }
    }
}
