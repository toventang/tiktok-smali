package com.bytedance.ies.uikit.dialog;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

public final class a {
    TextView A;
    TextView B;
    public View C;
    public boolean D;
    public ListAdapter E;
    public int F = -1;
    int G;
    int H;
    public int I;
    public int J;
    public int K;
    public int L;
    int M;
    public Handler N;
    final View.OnClickListener O = new View.OnClickListener() {
        /* class com.bytedance.ies.uikit.dialog.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(21192);
        }

        public final void onClick(View view) {
            Message obtain;
            if (view == a.this.n && a.this.p != null) {
                obtain = Message.obtain(a.this.p);
            } else if (view != a.this.q || a.this.s == null) {
                if (view == a.this.t && a.this.v != null) {
                    obtain = Message.obtain(a.this.v);
                }
                a.this.N.obtainMessage(1, a.this.f35418b).sendToTarget();
            } else {
                obtain = Message.obtain(a.this.s);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            a.this.N.obtainMessage(1, a.this.f35418b).sendToTarget();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Context f35417a;

    /* renamed from: b  reason: collision with root package name */
    public final DialogInterface f35418b;

    /* renamed from: c  reason: collision with root package name */
    final Window f35419c;

    /* renamed from: d  reason: collision with root package name */
    CharSequence f35420d;

    /* renamed from: e  reason: collision with root package name */
    CharSequence f35421e;

    /* renamed from: f  reason: collision with root package name */
    public ListView f35422f;

    /* renamed from: g  reason: collision with root package name */
    View f35423g;

    /* renamed from: h  reason: collision with root package name */
    int f35424h;

    /* renamed from: i  reason: collision with root package name */
    int f35425i;

    /* renamed from: j  reason: collision with root package name */
    int f35426j;

    /* renamed from: k  reason: collision with root package name */
    int f35427k;

    /* renamed from: l  reason: collision with root package name */
    int f35428l;

    /* renamed from: m  reason: collision with root package name */
    boolean f35429m;
    public Button n;
    CharSequence o;
    public Message p;
    public Button q;
    CharSequence r;
    public Message s;
    public Button t;
    CharSequence u;
    public Message v;
    public ScrollView w;
    int x;
    Drawable y;
    ImageView z;

    static {
        Covode.recordClassIndex(21191);
    }

    static final class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f35467a;

        static {
            Covode.recordClassIndex(21202);
        }

        public b(DialogInterface dialogInterface) {
            this.f35467a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f35467a.get(), message.what);
            } else if (i2 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public final void a(CharSequence charSequence) {
        this.f35420d = charSequence;
        TextView textView = this.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.a$a  reason: collision with other inner class name */
    public static class C0806a {
        public int A;
        public boolean B;
        public boolean[] C;
        public boolean D;
        public boolean E;
        public int F = -1;
        public DialogInterface.OnMultiChoiceClickListener G;
        public Cursor H;
        public String I;
        public String J;
        public boolean K;
        public AdapterView.OnItemSelectedListener L;
        public boolean M = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f35442a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f35443b;

        /* renamed from: c  reason: collision with root package name */
        public int f35444c;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f35445d;

        /* renamed from: e  reason: collision with root package name */
        public int f35446e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f35447f;

        /* renamed from: g  reason: collision with root package name */
        public View f35448g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f35449h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f35450i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f35451j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f35452k;

        /* renamed from: l  reason: collision with root package name */
        public DialogInterface.OnClickListener f35453l;

        /* renamed from: m  reason: collision with root package name */
        public CharSequence f35454m;
        public DialogInterface.OnClickListener n;
        public boolean o;
        public DialogInterface.OnCancelListener p;
        public DialogInterface.OnDismissListener q;
        public DialogInterface.OnKeyListener r;
        public CharSequence[] s;
        public ListAdapter t;
        public DialogInterface.OnClickListener u;
        public int v;
        public View w;
        public int x;
        public int y;
        public int z;

        static {
            Covode.recordClassIndex(21197);
        }

        public C0806a(Context context) {
            this.f35442a = context;
            this.o = true;
            this.f35443b = (LayoutInflater) a(context, "layout_inflater");
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(13833);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(13833);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    public final void a(int i2) {
        this.y = null;
        this.x = i2;
        ImageView imageView = this.z;
        if (imageView == null) {
            return;
        }
        if (i2 != 0) {
            imageView.setImageResource(i2);
        } else {
            imageView.setVisibility(8);
        }
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    static class c extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(21203);
        }

        public final long getItemId(int i2) {
            return (long) i2;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public c(Context context, int i2, CharSequence[] charSequenceArr) {
            super(context, i2, (int) R.id.eiz, charSequenceArr);
        }
    }

    public a(Context context, DialogInterface dialogInterface, Window window) {
        this.f35417a = context;
        this.f35418b = dialogInterface;
        this.f35419c = window;
        this.N = new b(dialogInterface);
        this.G = R.layout.b1q;
        this.H = 0;
        this.I = R.layout.b1r;
        this.J = R.layout.b1t;
        this.K = R.layout.b1u;
        this.L = R.layout.b1s;
    }

    public static void a(View view, View view2, View view3) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view2.setVisibility(i2);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i4 = 4;
            }
            view3.setVisibility(i4);
        }
    }

    public final void a(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.N.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.u = charSequence;
            this.v = message;
        } else if (i2 == -2) {
            this.r = charSequence;
            this.s = message;
        } else if (i2 == -1) {
            this.o = charSequence;
            this.p = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
