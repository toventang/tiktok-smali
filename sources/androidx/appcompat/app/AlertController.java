package androidx.appcompat.app;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class AlertController {
    NestedScrollView A;
    int B;
    Drawable C;
    ImageView D;
    TextView E;
    TextView F;
    public View G;
    ListAdapter H;
    int I = -1;
    int J;
    int K;
    int L;
    int M;
    int N;
    int O;
    boolean P;
    public int Q;
    Handler R;
    final View.OnClickListener S = new View.OnClickListener() {
        /* class androidx.appcompat.app.AlertController.AnonymousClass1 */

        static {
            Covode.recordClassIndex(229);
        }

        public final void onClick(View view) {
            Message obtain;
            if (view == AlertController.this.o && AlertController.this.q != null) {
                obtain = Message.obtain(AlertController.this.q);
            } else if (view != AlertController.this.s || AlertController.this.u == null) {
                if (view == AlertController.this.w && AlertController.this.y != null) {
                    obtain = Message.obtain(AlertController.this.y);
                }
                AlertController.this.R.obtainMessage(1, AlertController.this.f838b).sendToTarget();
            } else {
                obtain = Message.obtain(AlertController.this.u);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController.this.R.obtainMessage(1, AlertController.this.f838b).sendToTarget();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final Context f837a;

    /* renamed from: b  reason: collision with root package name */
    final h f838b;

    /* renamed from: c  reason: collision with root package name */
    final Window f839c;

    /* renamed from: d  reason: collision with root package name */
    final int f840d;

    /* renamed from: e  reason: collision with root package name */
    CharSequence f841e;

    /* renamed from: f  reason: collision with root package name */
    CharSequence f842f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f843g;

    /* renamed from: h  reason: collision with root package name */
    View f844h;

    /* renamed from: i  reason: collision with root package name */
    int f845i;

    /* renamed from: j  reason: collision with root package name */
    int f846j;

    /* renamed from: k  reason: collision with root package name */
    int f847k;

    /* renamed from: l  reason: collision with root package name */
    int f848l;

    /* renamed from: m  reason: collision with root package name */
    int f849m;
    boolean n;
    Button o;
    CharSequence p;
    Message q;
    Drawable r;
    Button s;
    CharSequence t;
    Message u;
    Drawable v;
    Button w;
    CharSequence x;
    Message y;
    Drawable z;

    static {
        Covode.recordClassIndex(228);
    }

    static final class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DialogInterface> f890a;

        static {
            Covode.recordClassIndex(240);
        }

        public b(DialogInterface dialogInterface) {
            this.f890a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f890a.get(), message.what);
            } else if (i2 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public final void a(CharSequence charSequence) {
        this.f841e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public static class a {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public boolean O = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f865a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f866b;

        /* renamed from: c  reason: collision with root package name */
        public int f867c;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f868d;

        /* renamed from: e  reason: collision with root package name */
        public int f869e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f870f;

        /* renamed from: g  reason: collision with root package name */
        public View f871g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f872h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f873i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f874j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f875k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f876l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f877m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public boolean r;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        static {
            Covode.recordClassIndex(235);
        }

        public a(Context context) {
            this.f865a = context;
            this.r = true;
            this.f866b = (LayoutInflater) a(context, "layout_inflater");
        }

        private static Object a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        i.f107220b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!i.f107219a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new i.a((Handler) declaredField.get(systemService)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                }
                return systemService;
            }
        }
    }

    static void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
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

    public final void a(int i2) {
        this.C = null;
        this.B = i2;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i2 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public static class RecycleListView extends ListView {

        /* renamed from: a  reason: collision with root package name */
        final int f863a;

        /* renamed from: b  reason: collision with root package name */
        final int f864b;

        static {
            Covode.recordClassIndex(234);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6q, R.attr.a6t});
            this.f864b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f863a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    static class c extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(241);
        }

        public final long getItemId(int i2) {
            return (long) i2;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public c(Context context, int i2, CharSequence[] charSequenceArr) {
            super(context, i2, 16908308, charSequenceArr);
        }
    }

    static void a(View view, View view2, View view3) {
        int i2;
        int i3 = 0;
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
                i3 = 4;
            }
            view3.setVisibility(i3);
        }
    }

    public AlertController(Context context, h hVar, Window window) {
        this.f837a = context;
        this.f838b = hVar;
        this.f839c = window;
        this.R = new b(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16842994, R.attr.lw, R.attr.lx, R.attr.a2q, R.attr.a2r, R.attr.a60, R.attr.ac8, R.attr.acq}, R.attr.i7, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        this.K = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(7, 0);
        this.O = obtainStyledAttributes.getResourceId(3, 0);
        this.P = obtainStyledAttributes.getBoolean(6, true);
        this.f840d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        hVar.cg_();
    }

    public final void a(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.x = charSequence;
            this.y = message;
            this.z = drawable;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
        } else if (i2 == -1) {
            this.p = charSequence;
            this.q = message;
            this.r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
