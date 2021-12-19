package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.h.v;
import androidx.core.h.w;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.ae;
import androidx.recyclerview.widget.af;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.z;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements androidx.core.h.k, androidx.core.h.l, androidx.core.h.t {
    static final Interpolator N = new Interpolator() {
        /* class androidx.recyclerview.widget.RecyclerView.AnonymousClass3 */

        static {
            Covode.recordClassIndex(1474);
        }

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    private static final int[] O = {16843830};
    private static final boolean P = false;
    private static final boolean Q = false;
    private static final Class<?>[] R = {Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};

    /* renamed from: a  reason: collision with root package name */
    static final boolean f3807a;

    /* renamed from: b  reason: collision with root package name */
    static final boolean f3808b;

    /* renamed from: c  reason: collision with root package name */
    static final boolean f3809c = true;

    /* renamed from: d  reason: collision with root package name */
    static final boolean f3810d;
    boolean A;
    boolean B;
    f C;
    final u D;
    m E;
    m.a F;
    final s G;
    boolean H;
    boolean I;
    boolean J;
    z K;
    final int[] L;
    final List<ViewHolder> M;
    private final q S;
    private final Rect T;
    private final ArrayList<m> U;
    private m V;
    private int W;
    private f.b aA;
    private d aB;
    private final int[] aC;
    private androidx.core.h.m aD;
    private final int[] aE;
    private final int[] aF;
    private Runnable aG;
    private boolean aH;
    private int aI;
    private int aJ;
    private final af.b aK;
    private boolean aa;
    private int ab;
    private final AccessibilityManager ac;
    private int ad;
    private int ae;
    private e af;
    private EdgeEffect ag;
    private EdgeEffect ah;
    private EdgeEffect ai;
    private EdgeEffect aj;
    private int ak;
    private int al;
    private VelocityTracker am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    private l as;
    private final int at;
    private final int au;
    private float av;
    private float aw;
    private boolean ax;
    private n ay;
    private List<n> az;

    /* renamed from: e  reason: collision with root package name */
    public final o f3811e;

    /* renamed from: f  reason: collision with root package name */
    SavedState f3812f;

    /* renamed from: g  reason: collision with root package name */
    a f3813g;

    /* renamed from: h  reason: collision with root package name */
    f f3814h;

    /* renamed from: i  reason: collision with root package name */
    final af f3815i;

    /* renamed from: j  reason: collision with root package name */
    boolean f3816j;

    /* renamed from: k  reason: collision with root package name */
    final Runnable f3817k;

    /* renamed from: l  reason: collision with root package name */
    final Rect f3818l;

    /* renamed from: m  reason: collision with root package name */
    final RectF f3819m;
    a n;
    i o;
    p p;
    final List<p> q;
    final ArrayList<h> r;
    boolean s;
    public boolean t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    List<k> z;

    public interface d {
        static {
            Covode.recordClassIndex(1488);
        }

        int a(int i2, int i3);
    }

    public interface k {
        static {
            Covode.recordClassIndex(1502);
        }

        void a(View view);

        void b(View view);
    }

    public static abstract class l {
        static {
            Covode.recordClassIndex(1503);
        }

        public abstract boolean a(int i2, int i3);
    }

    public interface m {
        static {
            Covode.recordClassIndex(1504);
        }

        void a(boolean z);

        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class n {
        static {
            Covode.recordClassIndex(1505);
        }

        public void a(RecyclerView recyclerView, int i2) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public interface p {
        static {
            Covode.recordClassIndex(1507);
        }
    }

    public static abstract class t {
        static {
            Covode.recordClassIndex(1513);
        }

        public abstract View a(o oVar, int i2);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void scrollTo(int i2, int i3) {
    }

    public static abstract class ViewHolder {
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public final View itemView;
        a<? extends ViewHolder> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        o mScrapContainer;
        ViewHolder mShadowedHolder;
        ViewHolder mShadowingHolder;
        List<Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        public static int androidx_recyclerview_widget_RecyclerView$ViewHolder_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
            return 0;
        }

        public final a<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final int getLayoutPosition() {
            int i2 = this.mPreLayoutPosition;
            if (i2 == -1) {
                return this.mPosition;
            }
            return i2;
        }

        public final int getPosition() {
            int i2 = this.mPreLayoutPosition;
            if (i2 == -1) {
                return this.mPosition;
            }
            return i2;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            if (this.mScrapContainer != null) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.b(this);
        }

        static {
            Covode.recordClassIndex(1483);
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.d(this);
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            if ((this.mFlags & 512) != 0 || isInvalid()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            if ((this.mFlags & 1) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            if ((this.mFlags & 4) != 0) {
                return true;
            }
            return false;
        }

        public boolean isRemoved() {
            if ((this.mFlags & 8) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            if ((this.mFlags & 256) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            if ((this.mFlags & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            if ((this.mFlags & 16) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            if ((this.mFlags & 128) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            if ((this.mFlags & 32) != 0) {
                return true;
            }
            return false;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) != 0 || !v.b(this.itemView)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            if (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) {
                return false;
            }
            return true;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) != 0 || v.b(this.itemView)) {
                return false;
            }
            return true;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.c(this);
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            a adapter;
            int d2;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (d2 = this.mOwnerRecyclerView.d(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, d2);
        }

        public String toString() {
            String simpleName;
            String str;
            if (getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            } else {
                simpleName = getClass().getSimpleName();
            }
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                StringBuilder append = sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                } else {
                    str = "[attachedScrap]";
                }
                append.append(str);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i2) {
            this.mFlags = i2 | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i2) {
            if ((i2 & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.a(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i2 = this.mPendingAccessibilityState;
            if (i2 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i2;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = v.d(this.itemView);
            }
            recyclerView.a(this, 4);
        }

        public final void setIsRecyclable(boolean z) {
            int i2;
            int i3 = this.mIsRecyclableCount;
            if (z) {
                i2 = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                androidx_recyclerview_widget_RecyclerView$ViewHolder_com_ss_android_ugc_aweme_lancet_LogLancet_e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ".concat(String.valueOf(this)));
            } else if (!z) {
                if (i2 == 1) {
                    this.mFlags |= 16;
                }
            } else if (i2 == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(o oVar, boolean z) {
            this.mScrapContainer = oVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i2, int i3) {
            this.mFlags = (i2 & i3) | (this.mFlags & (i3 ^ -1));
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i2, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i2;
            }
            this.mPosition += i2;
            if (this.itemView.getLayoutParams() != null) {
                ((j) this.itemView.getLayoutParams()).f3849e = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i2, int i3, boolean z) {
            addFlags(8);
            offsetPosition(i3, z);
            this.mPosition = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends Observable<c> {
        static {
            Covode.recordClassIndex(1486);
        }

        b() {
        }

        public final boolean a() {
            if (!this.mObservers.isEmpty()) {
                return true;
            }
            return false;
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a();
            }
        }

        public final void c() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).b();
            }
        }

        public final void a(int i2, int i3) {
            a(i2, i3, null);
        }

        public final void d(int i2, int i3) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i2, i3, 1);
            }
        }

        public final void b(int i2, int i3) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).b(i2, i3);
            }
        }

        public final void c(int i2, int i3) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).c(i2, i3);
            }
        }

        public final void a(int i2, int i3, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i2, i3, obj);
            }
        }
    }

    public static abstract class i {
        boolean A = false;
        public boolean B = false;
        public boolean C = false;
        public boolean D = true;
        public boolean E = true;
        public int F;
        boolean G;
        public int H;
        public int I;
        public int J;
        public int K;

        /* renamed from: a  reason: collision with root package name */
        private final ae.b f3839a;

        /* renamed from: b  reason: collision with root package name */
        private final ae.b f3840b;
        f v;
        public RecyclerView w;
        ae x;
        ae y;
        r z;

        public interface a {
            static {
                Covode.recordClassIndex(1499);
            }

            void a(int i2, int i3);
        }

        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f3843a;

            /* renamed from: b  reason: collision with root package name */
            public int f3844b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f3845c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f3846d;

            static {
                Covode.recordClassIndex(1500);
            }
        }

        static {
            Covode.recordClassIndex(1496);
        }

        public int a(int i2, o oVar, s sVar) {
            return 0;
        }

        public int a(o oVar, s sVar) {
            return -1;
        }

        public View a(View view, int i2, o oVar, s sVar) {
            return null;
        }

        public void a(int i2, int i3, s sVar, a aVar) {
        }

        public void a(int i2, a aVar) {
        }

        public void a(Parcelable parcelable) {
        }

        public void a(a aVar, a aVar2) {
        }

        public void a(o oVar, s sVar, View view, androidx.core.h.a.d dVar) {
        }

        public void a(s sVar) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void a(RecyclerView recyclerView, o oVar) {
        }

        public void a(RecyclerView recyclerView, s sVar, int i2) {
        }

        public boolean a(j jVar) {
            return jVar != null;
        }

        public int b(int i2, o oVar, s sVar) {
            return 0;
        }

        public int b(o oVar, s sVar) {
            return -1;
        }

        public int b(s sVar) {
            return 0;
        }

        public abstract j b();

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }

        public int c(s sVar) {
            return 0;
        }

        public void c(o oVar, s sVar) {
        }

        public void c(RecyclerView recyclerView) {
        }

        public void c(RecyclerView recyclerView, int i2, int i3) {
        }

        public int d(s sVar) {
            return 0;
        }

        public int e(s sVar) {
            return 0;
        }

        public Parcelable e() {
            return null;
        }

        public void e(int i2) {
        }

        public int f(s sVar) {
            return 0;
        }

        public boolean f() {
            return false;
        }

        public int g(s sVar) {
            return 0;
        }

        public boolean g() {
            return false;
        }

        public void j(int i2) {
        }

        public boolean x_() {
            return false;
        }

        public void y_() {
        }

        /* access modifiers changed from: package-private */
        public boolean z_() {
            return false;
        }

        public boolean w_() {
            return this.C;
        }

        /* access modifiers changed from: package-private */
        public final void a(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.w = null;
                this.v = null;
                this.J = 0;
                this.K = 0;
            } else {
                this.w = recyclerView;
                this.v = recyclerView.f3814h;
                this.J = recyclerView.getWidth();
                this.K = recyclerView.getHeight();
            }
            this.H = 1073741824;
            this.I = 1073741824;
        }

        public void a(Rect rect, int i2, int i3) {
            d(a(i2, rect.width() + t() + v(), v.h(this.w)), a(i3, rect.height() + u() + w(), v.i(this.w)));
        }

        public void a(String str) {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                recyclerView.d_(str);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(RecyclerView recyclerView) {
            this.B = true;
            c(recyclerView);
        }

        /* access modifiers changed from: package-private */
        public final void b(RecyclerView recyclerView, o oVar) {
            this.B = false;
            a(recyclerView, oVar);
        }

        public final boolean a(Runnable runnable) {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public j a(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof j) {
                return new j((j) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new j((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new j(layoutParams);
        }

        public j a(Context context, AttributeSet attributeSet) {
            return new j(context, attributeSet);
        }

        public final void a(r rVar) {
            r rVar2 = this.z;
            if (!(rVar2 == null || rVar == rVar2 || !rVar2.f3866k)) {
                this.z.d();
            }
            this.z = rVar;
            RecyclerView recyclerView = this.w;
            recyclerView.D.b();
            if (rVar.f3868m) {
                rVar.getClass().getSimpleName();
                rVar.getClass().getSimpleName();
            }
            rVar.f3863h = recyclerView;
            rVar.f3864i = this;
            if (rVar.f3862g != -1) {
                rVar.f3863h.G.f3876a = rVar.f3862g;
                rVar.f3866k = true;
                rVar.f3865j = true;
                rVar.f3867l = rVar.f3863h.o.c(rVar.f3862g);
                rVar.f3863h.D.a();
                rVar.f3868m = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void a(View view, int i2) {
            a(view, i2, false);
        }

        public final void a(View view, o oVar) {
            d(view);
            oVar.a(view);
        }

        public final void a(int i2, o oVar) {
            View g2 = g(i2);
            a(i2);
            oVar.a(g2);
        }

        public final void a(o oVar) {
            for (int s = s() - 1; s >= 0; s--) {
                View g2 = g(s);
                ViewHolder c2 = RecyclerView.c(g2);
                if (!c2.shouldIgnore()) {
                    if (!c2.isInvalid() || c2.isRemoved() || this.w.n.mHasStableIds) {
                        b(s);
                        oVar.c(g2);
                        this.w.f3815i.d(c2);
                    } else {
                        a(s);
                        oVar.a(c2);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean a(View view, int i2, int i3, j jVar) {
            return !this.D || !b(view.getMeasuredWidth(), i2, jVar.width) || !b(view.getMeasuredHeight(), i3, jVar.height);
        }

        /* access modifiers changed from: package-private */
        public final boolean b(View view, int i2, int i3, j jVar) {
            return view.isLayoutRequested() || !this.D || !b(view.getWidth(), i2, jVar.width) || !b(view.getHeight(), i3, jVar.height);
        }

        public final void a(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((j) view.getLayoutParams()).f3848d;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.w == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.w.f3819m;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public final boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
            int[] c2 = c(view, rect);
            int i2 = c2[0];
            int i3 = c2[1];
            if ((z3 && !d(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z2) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.a(i2, i3);
            }
            return true;
        }

        public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
            c(recyclerView, i2, i3);
        }

        public void a(o oVar, s sVar, int i2, int i3) {
            this.w.e(i2, i3);
        }

        /* access modifiers changed from: package-private */
        public final void a(View view, androidx.core.h.a.d dVar) {
            ViewHolder c2 = RecyclerView.c(view);
            if (c2 != null && !c2.isRemoved() && !this.v.d(c2.itemView)) {
                a(this.w.f3811e, this.w.G, view, dVar);
            }
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z2 = true;
                if (!recyclerView.canScrollVertically(1) && !this.w.canScrollVertically(-1) && !this.w.canScrollHorizontally(-1) && !this.w.canScrollHorizontally(1)) {
                    z2 = false;
                }
                accessibilityEvent.setScrollable(z2);
                if (this.w.n != null) {
                    accessibilityEvent.setItemCount(this.w.n.getItemCount());
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void B() {
            r rVar = this.z;
            if (rVar != null) {
                rVar.d();
            }
        }

        public final void o() {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public final int w() {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int x() {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                return v.f(recyclerView);
            }
            return 0;
        }

        public final int y() {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                return v.g(recyclerView);
            }
            return 0;
        }

        public final int A() {
            a adapter;
            RecyclerView recyclerView = this.w;
            if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
                return 0;
            }
            return adapter.getItemCount();
        }

        public final boolean p() {
            RecyclerView recyclerView = this.w;
            if (recyclerView == null || !recyclerView.f3816j) {
                return false;
            }
            return true;
        }

        public final boolean q() {
            r rVar = this.z;
            if (rVar == null || !rVar.f3866k) {
                return false;
            }
            return true;
        }

        public final void r() {
            for (int s = s() - 1; s >= 0; s--) {
                this.v.a(s);
            }
        }

        public final int s() {
            f fVar = this.v;
            if (fVar != null) {
                return fVar.a();
            }
            return 0;
        }

        public final int t() {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int u() {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public final int v() {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final View z() {
            View focusedChild;
            RecyclerView recyclerView = this.w;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.v.d(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public i() {
            AnonymousClass1 r2 = new ae.b() {
                /* class androidx.recyclerview.widget.RecyclerView.i.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1497);
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final int a() {
                    return i.this.t();
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final int b() {
                    return i.this.J - i.this.v();
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final int a(View view) {
                    return i.o(view) - ((j) view.getLayoutParams()).leftMargin;
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final View a(int i2) {
                    return i.this.g(i2);
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final int b(View view) {
                    return i.q(view) + ((j) view.getLayoutParams()).rightMargin;
                }
            };
            this.f3839a = r2;
            AnonymousClass2 r1 = new ae.b() {
                /* class androidx.recyclerview.widget.RecyclerView.i.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(1498);
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final int a() {
                    return i.this.u();
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final int b() {
                    return i.this.K - i.this.w();
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final int a(View view) {
                    return i.p(view) - ((j) view.getLayoutParams()).topMargin;
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final View a(int i2) {
                    return i.this.g(i2);
                }

                @Override // androidx.recyclerview.widget.ae.b
                public final int b(View view) {
                    return i.r(view) + ((j) view.getLayoutParams()).bottomMargin;
                }
            };
            this.f3840b = r1;
            this.x = new ae(r2);
            this.y = new ae(r1);
        }

        private void b(int i2) {
            g(i2);
            d(i2);
        }

        private void d(int i2) {
            this.v.d(i2);
        }

        public final void a_(View view) {
            a(view, -1, true);
        }

        public final void b_(View view) {
            a(view, 0, true);
        }

        public final void c(View view) {
            a(view, -1, false);
        }

        public final void i(View view) {
            b(view, -1);
        }

        private void a(int i2) {
            if (g(i2) != null) {
                this.v.a(i2);
            }
        }

        public static int e(View view) {
            return ((j) view.getLayoutParams()).f3847c.getLayoutPosition();
        }

        public static int f(View view) {
            return RecyclerView.c(view).getItemViewType();
        }

        public static void k(View view) {
            ViewHolder c2 = RecyclerView.c(view);
            c2.stopIgnoring();
            c2.resetInternal();
            c2.addFlags(4);
        }

        public static int o(View view) {
            return view.getLeft() - u(view);
        }

        public static int p(View view) {
            return view.getTop() - s(view);
        }

        public static int q(View view) {
            return view.getRight() + v(view);
        }

        public static int r(View view) {
            return view.getBottom() + t(view);
        }

        public static int s(View view) {
            return ((j) view.getLayoutParams()).f3848d.top;
        }

        public static int t(View view) {
            return ((j) view.getLayoutParams()).f3848d.bottom;
        }

        public static int u(View view) {
            return ((j) view.getLayoutParams()).f3848d.left;
        }

        public static int v(View view) {
            return ((j) view.getLayoutParams()).f3848d.right;
        }

        public final View g(int i2) {
            f fVar = this.v;
            if (fVar != null) {
                return fVar.b(i2);
            }
            return null;
        }

        public final void h(View view) {
            int c2 = this.v.c(view);
            if (c2 >= 0) {
                d(c2);
            }
        }

        public static int m(View view) {
            Rect rect = ((j) view.getLayoutParams()).f3848d;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public static int n(View view) {
            Rect rect = ((j) view.getLayoutParams()).f3848d;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public final void c(o oVar) {
            for (int s = s() - 1; s >= 0; s--) {
                if (!RecyclerView.c(g(s)).shouldIgnore()) {
                    a(s, oVar);
                }
            }
        }

        public final void d(View view) {
            f fVar = this.v;
            int a2 = fVar.f4020a.a(view);
            if (a2 >= 0) {
                if (fVar.f4021b.d(a2)) {
                    fVar.b(view);
                }
                fVar.f4020a.a(a2);
            }
        }

        public final View g(View view) {
            View b2;
            RecyclerView recyclerView = this.w;
            if (recyclerView == null || (b2 = recyclerView.b(view)) == null || this.v.d(b2)) {
                return null;
            }
            return b2;
        }

        public void h(int i2) {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                int a2 = recyclerView.f3814h.a();
                for (int i3 = 0; i3 < a2; i3++) {
                    recyclerView.f3814h.b(i3).offsetLeftAndRight(i2);
                }
            }
        }

        public void i(int i2) {
            RecyclerView recyclerView = this.w;
            if (recyclerView != null) {
                int a2 = recyclerView.f3814h.a();
                for (int i3 = 0; i3 < a2; i3++) {
                    recyclerView.f3814h.b(i3).offsetTopAndBottom(i2);
                }
            }
        }

        public View c(int i2) {
            int s = s();
            for (int i3 = 0; i3 < s; i3++) {
                View g2 = g(i3);
                ViewHolder c2 = RecyclerView.c(g2);
                if (c2 != null && c2.getLayoutPosition() == i2 && !c2.shouldIgnore() && (this.w.G.f3882g || !c2.isRemoved())) {
                    return g2;
                }
            }
            return null;
        }

        public final void j(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.w;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.w.a());
            }
            ViewHolder c2 = RecyclerView.c(view);
            c2.addFlags(128);
            this.w.f3815i.e(c2);
        }

        /* access modifiers changed from: package-private */
        public final void d(RecyclerView recyclerView) {
            a_(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void l(View view) {
            j jVar = (j) view.getLayoutParams();
            Rect f2 = this.w.f(view);
            int i2 = f2.left + f2.right + 0;
            int i3 = f2.top + f2.bottom + 0;
            int a2 = a(this.J, this.H, t() + v() + jVar.leftMargin + jVar.rightMargin + i2, jVar.width, f());
            int a3 = a(this.K, this.I, u() + w() + jVar.topMargin + jVar.bottomMargin + i3, jVar.height, g());
            if (b(view, a2, a3, jVar)) {
                view.measure(a2, a3);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(o oVar) {
            int size = oVar.f3851a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = oVar.f3851a.get(i2).itemView;
                ViewHolder c2 = RecyclerView.c(view);
                if (!c2.shouldIgnore()) {
                    c2.setIsRecyclable(false);
                    if (c2.isTmpDetached()) {
                        this.w.removeDetachedView(view, false);
                    }
                    if (this.w.C != null) {
                        this.w.C.c(c2);
                    }
                    c2.setIsRecyclable(true);
                    oVar.b(view);
                }
            }
            oVar.f3851a.clear();
            if (oVar.f3852b != null) {
                oVar.f3852b.clear();
            }
            if (size > 0) {
                this.w.invalidate();
            }
        }

        public final void d(int i2, int i3) {
            this.w.setMeasuredDimension(i2, i3);
        }

        private void b(View view, int i2) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewHolder c2 = RecyclerView.c(view);
            if (c2.isRemoved()) {
                this.w.f3815i.c(c2);
            } else {
                this.w.f3815i.d(c2);
            }
            this.v.a(view, i2, layoutParams, c2.isRemoved());
        }

        /* access modifiers changed from: package-private */
        public final void a_(int i2, int i3) {
            this.J = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.H = mode;
            if (mode == 0 && !RecyclerView.f3808b) {
                this.J = 0;
            }
            this.K = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.I = mode2;
            if (mode2 == 0 && !RecyclerView.f3808b) {
                this.K = 0;
            }
        }

        private int[] c(View view, Rect rect) {
            int[] iArr = new int[2];
            int t = t();
            int u = u();
            int v2 = this.J - v();
            int w2 = this.K - w();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - t;
            int min = Math.min(0, i2);
            int i3 = top - u;
            int min2 = Math.min(0, i3);
            int i4 = width - v2;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - w2);
            if (v.e(this.w) != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void a(int i2, int i3) {
            View g2 = g(i2);
            if (g2 != null) {
                b(i2);
                b(g2, i3);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.w.toString());
        }

        /* access modifiers changed from: package-private */
        public final void c(int i2, int i3) {
            int s = s();
            if (s == 0) {
                this.w.e(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < s; i8++) {
                View g2 = g(i8);
                Rect rect = this.w.f3818l;
                RecyclerView.a(g2, rect);
                if (rect.left < i6) {
                    i6 = rect.left;
                }
                if (rect.right > i4) {
                    i4 = rect.right;
                }
                if (rect.top < i7) {
                    i7 = rect.top;
                }
                if (rect.bottom > i5) {
                    i5 = rect.bottom;
                }
            }
            this.w.f3818l.set(i6, i7, i4, i5);
            a(this.w.f3818l, i2, i3);
        }

        public final void b(View view, Rect rect) {
            RecyclerView recyclerView = this.w;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.f(view));
            }
        }

        public static int a(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i3, i4));
            }
            if (mode != 1073741824) {
                return Math.max(i3, i4);
            }
            return size;
        }

        private boolean d(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int t = t();
            int u = u();
            int v2 = this.J - v();
            int w2 = this.K - w();
            Rect rect = this.w.f3818l;
            RecyclerView.a(focusedChild, rect);
            if (rect.left - i2 >= v2 || rect.right - i2 <= t || rect.top - i3 >= w2 || rect.bottom - i3 <= u) {
                return false;
            }
            return true;
        }

        private static boolean b(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i2) {
                    return true;
                }
                return false;
            } else if (size >= i2) {
                return true;
            } else {
                return false;
            }
        }

        private void a(View view, int i2, boolean z2) {
            ViewHolder c2 = RecyclerView.c(view);
            if (z2 || c2.isRemoved()) {
                this.w.f3815i.c(c2);
            } else {
                this.w.f3815i.d(c2);
            }
            j jVar = (j) view.getLayoutParams();
            if (c2.wasReturnedFromScrap() || c2.isScrap()) {
                if (c2.isScrap()) {
                    c2.unScrap();
                } else {
                    c2.clearReturnedFromScrapFlag();
                }
                this.v.a(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.w) {
                int c3 = this.v.c(view);
                if (i2 == -1) {
                    i2 = this.v.a();
                }
                if (c3 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.w.indexOfChild(view) + this.w.a());
                } else if (c3 != i2) {
                    this.w.o.a(c3, i2);
                }
            } else {
                this.v.a(view, i2, false);
                jVar.f3849e = true;
                r rVar = this.z;
                if (rVar != null && rVar.f3866k) {
                    this.z.a(view);
                }
            }
            if (jVar.f3850f) {
                c2.itemView.invalidate();
                jVar.f3850f = false;
            }
        }

        public static b a(Context context, AttributeSet attributeSet, int i2, int i3) {
            b bVar = new b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842987, 16842993, R.attr.tw, R.attr.tx, R.attr.ty, R.attr.tz, R.attr.u0, R.attr.zb, R.attr.a9t, R.attr.acz, R.attr.aex}, i2, i3);
            bVar.f3843a = obtainStyledAttributes.getInt(0, 1);
            bVar.f3844b = obtainStyledAttributes.getInt(10, 1);
            bVar.f3845c = obtainStyledAttributes.getBoolean(9, false);
            bVar.f3846d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
            if (r5 != 1073741824) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r0 = 0
                int r4 = java.lang.Math.max(r0, r4)
                r3 = -2
                r2 = -1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x0017
                if (r7 < 0) goto L_0x0027
            L_0x0010:
                r5 = 1073741824(0x40000000, float:2.0)
            L_0x0012:
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r0
            L_0x0017:
                if (r7 < 0) goto L_0x001a
                goto L_0x0010
            L_0x001a:
                if (r7 != r2) goto L_0x001e
            L_0x001c:
                r7 = r4
                goto L_0x0012
            L_0x001e:
                if (r7 != r3) goto L_0x002d
                if (r5 == r1) goto L_0x0024
                if (r5 != r0) goto L_0x0034
            L_0x0024:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x001c
            L_0x0027:
                if (r7 != r2) goto L_0x0030
                if (r5 == r1) goto L_0x001c
                if (r5 == r0) goto L_0x001c
            L_0x002d:
                r5 = 0
                r7 = 0
                goto L_0x0012
            L_0x0030:
                if (r7 != r3) goto L_0x002d
                r7 = 0
                goto L_0x0035
            L_0x0034:
                r7 = r4
            L_0x0035:
                r5 = 0
                goto L_0x0012
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i.a(int, int, int, int, boolean):int");
        }

        public static void a(View view, int i2, int i3, int i4, int i5) {
            Rect rect = ((j) view.getLayoutParams()).f3848d;
            view.layout(i2 + rect.left, i3 + rect.top, i4 - rect.right, i5 - rect.bottom);
        }

        public void b(View view, int i2, int i3, int i4, int i5) {
            j jVar = (j) view.getLayoutParams();
            Rect rect = jVar.f3848d;
            view.layout(i2 + rect.left + jVar.leftMargin, i3 + rect.top + jVar.topMargin, (i4 - rect.right) - jVar.rightMargin, (i5 - rect.bottom) - jVar.bottomMargin);
        }
    }

    public a getAdapter() {
        return this.n;
    }

    public boolean getClipToPadding() {
        return this.f3816j;
    }

    public z getCompatAccessibilityDelegate() {
        return this.K;
    }

    public e getEdgeEffectFactory() {
        return this.af;
    }

    public f getItemAnimator() {
        return this.C;
    }

    public i getLayoutManager() {
        return this.o;
    }

    public int getMaxFlingVelocity() {
        return this.au;
    }

    public int getMinFlingVelocity() {
        return this.at;
    }

    public l getOnFlingListener() {
        return this.as;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.ax;
    }

    public int getScrollState() {
        return this.ak;
    }

    public boolean isAttachedToWindow() {
        return this.s;
    }

    public final boolean isLayoutSuppressed() {
        return this.x;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return " " + super.toString() + ", adapter:" + this.n + ", layout:" + this.o + ", context:" + getContext();
    }

    public void a(a aVar, boolean z2) {
        setLayoutFrozen(false);
        a(aVar, true, z2);
        c(true);
        requestLayout();
    }

    private void a(a aVar, boolean z2, boolean z3) {
        a aVar2 = this.n;
        if (aVar2 != null) {
            aVar2.unregisterAdapterDataObserver(this.S);
            this.n.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            b();
        }
        this.f3813g.a();
        a aVar3 = this.n;
        this.n = aVar;
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.S);
            aVar.onAttachedToRecyclerView(this);
        }
        i iVar = this.o;
        if (iVar != null) {
            iVar.a(aVar3, this.n);
        }
        this.f3811e.a(aVar3, this.n, z2);
        this.G.f3881f = true;
    }

    public final void a(k kVar) {
        if (this.z == null) {
            this.z = new ArrayList();
        }
        this.z.add(kVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z2 = view.getParent() == this;
        this.f3811e.b(a(view));
        if (viewHolder.isTmpDetached()) {
            this.f3814h.a(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.f3814h.a(view, -1, true);
        } else {
            f fVar = this.f3814h;
            int a2 = fVar.f4020a.a(view);
            if (a2 >= 0) {
                fVar.f4021b.a(a2);
                fVar.a(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
        }
    }

    public final void a(h hVar) {
        i iVar = this.o;
        if (iVar != null) {
            iVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.r.isEmpty()) {
            setWillNotDraw(false);
        }
        this.r.add(hVar);
        J();
        requestLayout();
    }

    public final void a(n nVar) {
        if (this.az == null) {
            this.az = new ArrayList();
        }
        this.az.add(nVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, int[] iArr) {
        h();
        j();
        androidx.core.d.g.a("RV Scroll");
        a(this.G);
        int a2 = i2 != 0 ? this.o.a(i2, this.f3811e, this.G) : 0;
        int b2 = i3 != 0 ? this.o.b(i3, this.f3811e, this.G) : 0;
        androidx.core.d.g.a();
        int a3 = this.f3814h.a();
        for (int i4 = 0; i4 < a3; i4++) {
            View b3 = this.f3814h.b(i4);
            ViewHolder a4 = a(b3);
            if (!(a4 == null || a4.mShadowingHolder == null)) {
                View view = a4.mShadowingHolder.itemView;
                int left = b3.getLeft();
                int top = b3.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        b(true);
        a(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    private boolean a(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        g();
        if (this.n != null) {
            int[] iArr = this.L;
            iArr[0] = 0;
            iArr[1] = 0;
            a(i2, i3, iArr);
            int[] iArr2 = this.L;
            i6 = iArr2[0];
            i5 = iArr2[1];
            i7 = i2 - i6;
            i8 = i3 - i5;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.r.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.L;
        iArr3[0] = 0;
        iArr3[1] = 0;
        a(i6, i5, i7, i8, this.aE, i4, iArr3);
        int[] iArr4 = this.L;
        int i9 = i7 - iArr4[0];
        int i10 = i8 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i11 = this.ap;
        int[] iArr5 = this.aE;
        this.ap = i11 - iArr5[0];
        this.aq -= iArr5[1];
        int[] iArr6 = this.aF;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.h.i.a(motionEvent)) {
                a(motionEvent.getX(), (float) i9, motionEvent.getY(), (float) i10);
            }
            c(i2, i3);
        }
        if (!(i6 == 0 && i5 == 0)) {
            f(i6, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i5 == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        if (this.W <= 0) {
            this.W = 1;
        }
        if (!z2 && !this.x) {
            this.w = false;
        }
        if (this.W == 1) {
            if (z2 && this.w && !this.x && this.o != null && this.n != null) {
                C();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.W--;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, boolean z2) {
        i iVar = this.o;
        if (iVar != null && !this.x) {
            boolean f2 = iVar.f();
            int i4 = 0;
            if (!f2) {
                i2 = 0;
            }
            if (!this.o.g()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (z2) {
                    if (i2 != 0) {
                        i4 = 1;
                    }
                    if (i3 != 0) {
                        i4 |= 2;
                    }
                    h(i4, 1);
                }
                this.D.a(i2, i3, Integer.MIN_VALUE, null);
            }
        }
    }

    public boolean b(int i2, int i3) {
        int i4 = i3;
        i iVar = this.o;
        if (iVar == null || this.x) {
            return false;
        }
        boolean f2 = iVar.f();
        boolean g2 = this.o.g();
        if (!f2 || Math.abs(i2) < this.at) {
            i2 = 0;
        }
        if (!g2 || Math.abs(i4) < this.at) {
            i4 = 0;
        }
        if (i2 == 0 && i4 == 0) {
            return false;
        }
        float f3 = (float) i2;
        float f4 = (float) i4;
        if (!dispatchNestedPreFling(f3, f4)) {
            boolean z2 = f2 || g2;
            dispatchNestedFling(f3, f4, z2);
            l lVar = this.as;
            if (lVar != null && lVar.a(i2, i4)) {
                return true;
            }
            if (z2) {
                if (g2) {
                    boolean z3 = f2 ? 1 : 0;
                    char c2 = f2 ? 1 : 0;
                    f2 = z3 | true;
                }
                int i5 = f2 ? 1 : 0;
                int i6 = f2 ? 1 : 0;
                int i7 = f2 ? 1 : 0;
                h(i5, 1);
                int i8 = this.au;
                int max = Math.max(-i8, Math.min(i2, i8));
                int i9 = this.au;
                int max2 = Math.max(-i9, Math.min(i4, i9));
                u uVar = this.D;
                RecyclerView.this.setScrollState(2);
                uVar.f3890b = 0;
                uVar.f3889a = 0;
                Interpolator interpolator = uVar.f3892d;
                Interpolator interpolator2 = N;
                if (interpolator != interpolator2) {
                    uVar.f3892d = interpolator2;
                    uVar.f3891c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
                }
                uVar.f3891c.fling(0, 0, max, max2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                uVar.a();
                return true;
            }
        }
        return false;
    }

    public final void a(m mVar) {
        this.U.add(mVar);
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.U.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.U.get(i2);
            if (mVar.a(this, motionEvent) && action != 3) {
                this.V = mVar;
                return true;
            }
        }
        return false;
    }

    private void a(s sVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.D.f3891c;
            sVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            sVar.p = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        sVar.o = 0;
        sVar.p = 0;
    }

    /* access modifiers changed from: package-private */
    public final void a(ViewHolder viewHolder, f.c cVar) {
        viewHolder.setFlags(0, 8192);
        if (this.G.f3883h && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.f3815i.a(e(viewHolder), viewHolder);
        }
        this.f3815i.a(viewHolder, cVar);
    }

    private void a(int[] iArr) {
        int a2 = this.f3814h.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < a2; i4++) {
            ViewHolder c2 = c(this.f3814h.b(i4));
            if (!c2.shouldIgnore()) {
                int layoutPosition = c2.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(ViewHolder viewHolder) {
        f fVar = this.C;
        return fVar == null || fVar.a(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    public final ViewHolder a(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return c(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final ViewHolder a(int i2, boolean z2) {
        int b2 = this.f3814h.b();
        ViewHolder viewHolder = null;
        for (int i3 = 0; i3 < b2; i3++) {
            ViewHolder c2 = c(this.f3814h.c(i3));
            if (c2 != null && !c2.isRemoved()) {
                if (z2) {
                    if (c2.mPosition != i2) {
                        continue;
                    }
                } else if (c2.getLayoutPosition() != i2) {
                    continue;
                }
                if (!this.f3814h.d(c2.itemView)) {
                    return c2;
                }
                viewHolder = c2;
            }
        }
        return viewHolder;
    }

    public final View a(float f2, float f3) {
        for (int a2 = this.f3814h.a() - 1; a2 >= 0; a2--) {
            View b2 = this.f3814h.b(a2);
            float translationX = b2.getTranslationX();
            float translationY = b2.getTranslationY();
            if (f2 >= ((float) b2.getLeft()) + translationX && f2 <= ((float) b2.getRight()) + translationX && f3 >= ((float) b2.getTop()) + translationY && f3 <= ((float) b2.getBottom()) + translationY) {
                return b2;
            }
        }
        return null;
    }

    public final class o {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<ViewHolder> f3851a;

        /* renamed from: b  reason: collision with root package name */
        ArrayList<ViewHolder> f3852b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<ViewHolder> f3853c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<ViewHolder> f3854d;

        /* renamed from: e  reason: collision with root package name */
        int f3855e;

        /* renamed from: f  reason: collision with root package name */
        int f3856f;

        /* renamed from: g  reason: collision with root package name */
        RecycledViewPool f3857g;

        /* renamed from: h  reason: collision with root package name */
        public t f3858h;

        static {
            Covode.recordClassIndex(1506);
        }

        public final void a(View view, int i2) {
            j jVar;
            ViewHolder c2 = RecyclerView.c(view);
            if (c2 != null) {
                int b2 = RecyclerView.this.f3813g.b(i2);
                if (b2 < 0 || b2 >= RecyclerView.this.n.getItemCount()) {
                    throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + b2 + ").state:" + RecyclerView.this.G.a() + RecyclerView.this.a());
                }
                a(c2, b2, i2, Long.MAX_VALUE);
                ViewGroup.LayoutParams layoutParams = c2.itemView.getLayoutParams();
                if (layoutParams == null) {
                    jVar = (j) RecyclerView.this.generateDefaultLayoutParams();
                    c2.itemView.setLayoutParams(jVar);
                } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                    jVar = (j) RecyclerView.this.generateLayoutParams(layoutParams);
                    c2.itemView.setLayoutParams(jVar);
                } else {
                    jVar = (j) layoutParams;
                }
                boolean z = true;
                jVar.f3849e = true;
                jVar.f3847c = c2;
                if (c2.itemView.getParent() != null) {
                    z = false;
                }
                jVar.f3850f = z;
                return;
            }
            throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.a());
        }

        public final int a(int i2) {
            if (i2 < 0 || i2 >= RecyclerView.this.G.a()) {
                throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.G.a() + RecyclerView.this.a());
            } else if (!RecyclerView.this.G.f3882g) {
                return i2;
            } else {
                return RecyclerView.this.f3813g.b(i2);
            }
        }

        public final void a(View view) {
            ViewHolder c2 = RecyclerView.c(view);
            if (c2.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (c2.isScrap()) {
                c2.unScrap();
            } else if (c2.wasReturnedFromScrap()) {
                c2.clearReturnedFromScrapFlag();
            }
            a(c2);
            if (RecyclerView.this.C != null && !c2.isRecyclable()) {
                RecyclerView.this.C.c(c2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(ViewHolder viewHolder) {
            boolean z = false;
            boolean z2 = true;
            if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
                StringBuilder append = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(viewHolder.isScrap()).append(" isAttached:");
                if (viewHolder.itemView.getParent() != null) {
                    z = true;
                }
                throw new IllegalArgumentException(append.append(z).append(RecyclerView.this.a()).toString());
            } else if (viewHolder.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + viewHolder + RecyclerView.this.a());
            } else if (!viewHolder.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                if ((RecyclerView.this.n != null && doesTransientStatePreventRecycling && RecyclerView.this.n.onFailedToRecycleView(viewHolder)) || viewHolder.isRecyclable()) {
                    if (this.f3856f <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                        a(viewHolder, true);
                        z = false;
                        RecyclerView.this.f3815i.e(viewHolder);
                        if (!z && !z2 && doesTransientStatePreventRecycling) {
                            viewHolder.mBindingAdapter = null;
                            viewHolder.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    int size = this.f3853c.size();
                    if (size >= this.f3856f && size > 0) {
                        d(0);
                        size--;
                    }
                    if (RecyclerView.f3810d && size > 0 && !RecyclerView.this.F.a(viewHolder.mPosition)) {
                        int i2 = size - 1;
                        while (i2 >= 0) {
                            if (!RecyclerView.this.F.a(this.f3853c.get(i2).mPosition)) {
                                break;
                            }
                            i2--;
                        }
                        size = i2 + 1;
                    }
                    this.f3853c.add(size, viewHolder);
                    z = true;
                }
                z2 = false;
                RecyclerView.this.f3815i.e(viewHolder);
                if (!z) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.a());
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(ViewHolder viewHolder, boolean z) {
            RecyclerView.c(viewHolder);
            View view = viewHolder.itemView;
            if (RecyclerView.this.K != null) {
                z.a aVar = RecyclerView.this.K.f4225c;
                v.a(view, aVar instanceof z.a ? aVar.c(view) : null);
            }
            if (z) {
                e(viewHolder);
            }
            viewHolder.mBindingAdapter = null;
            viewHolder.mOwnerRecyclerView = null;
            c().putRecycledView(viewHolder);
        }

        public final void a() {
            this.f3851a.clear();
            g();
        }

        /* access modifiers changed from: package-private */
        public final RecycledViewPool c() {
            if (this.f3857g == null) {
                this.f3857g = new RecycledViewPool();
            }
            return this.f3857g;
        }

        private void g() {
            for (int size = this.f3853c.size() - 1; size >= 0; size--) {
                d(size);
            }
            this.f3853c.clear();
            if (RecyclerView.f3810d) {
                RecyclerView.this.F.a();
            }
        }

        public final void b() {
            int i2;
            if (RecyclerView.this.o != null) {
                i2 = RecyclerView.this.o.F;
            } else {
                i2 = 0;
            }
            this.f3856f = this.f3855e + i2;
            for (int size = this.f3853c.size() - 1; size >= 0 && this.f3853c.size() > this.f3856f; size--) {
                d(size);
            }
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            int size = this.f3853c.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewHolder viewHolder = this.f3853c.get(i2);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            if (RecyclerView.this.n == null || !RecyclerView.this.n.mHasStableIds) {
                g();
            }
        }

        /* access modifiers changed from: package-private */
        public final void f() {
            int size = this.f3853c.size();
            for (int i2 = 0; i2 < size; i2++) {
                j jVar = (j) this.f3853c.get(i2).itemView.getLayoutParams();
                if (jVar != null) {
                    jVar.f3849e = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void e() {
            int size = this.f3853c.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3853c.get(i2).clearOldPosition();
            }
            int size2 = this.f3851a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f3851a.get(i3).clearOldPosition();
            }
            ArrayList<ViewHolder> arrayList = this.f3852b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f3852b.get(i4).clearOldPosition();
                }
            }
        }

        public final View b(int i2) {
            return c(i2);
        }

        private void d(ViewHolder viewHolder) {
            if (viewHolder.itemView instanceof ViewGroup) {
                a((ViewGroup) viewHolder.itemView, false);
            }
        }

        public final View c(int i2) {
            return a(this, i2, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: package-private */
        public final void b(View view) {
            ViewHolder c2 = RecyclerView.c(view);
            c2.mScrapContainer = null;
            c2.mInChangeScrap = false;
            c2.clearReturnedFromScrapFlag();
            a(c2);
        }

        /* access modifiers changed from: package-private */
        public final void d(int i2) {
            a(this.f3853c.get(i2), true);
            this.f3853c.remove(i2);
        }

        public o() {
            ArrayList<ViewHolder> arrayList = new ArrayList<>();
            this.f3851a = arrayList;
            this.f3854d = Collections.unmodifiableList(arrayList);
            this.f3855e = 2;
            this.f3856f = 2;
        }

        private void e(ViewHolder viewHolder) {
            int size = RecyclerView.this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.this.q.get(i2);
            }
            if (RecyclerView.this.n != null) {
                RecyclerView.this.n.onViewRecycled(viewHolder);
            }
            if (RecyclerView.this.G != null) {
                RecyclerView.this.f3815i.e(viewHolder);
            }
        }

        private boolean c(ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                return RecyclerView.this.G.f3882g;
            }
            if (viewHolder.mPosition < 0 || viewHolder.mPosition >= RecyclerView.this.n.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + viewHolder + RecyclerView.this.a());
            } else if (!RecyclerView.this.G.f3882g && RecyclerView.this.n.getItemViewType(viewHolder.mPosition) != viewHolder.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.n.mHasStableIds || viewHolder.getItemId() == RecyclerView.this.n.getItemId(viewHolder.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        private ViewHolder e(int i2) {
            int size;
            int a2;
            ArrayList<ViewHolder> arrayList = this.f3852b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                for (int i3 = 0; i3 < size; i3++) {
                    ViewHolder viewHolder = this.f3852b.get(i3);
                    if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i2) {
                        viewHolder.addFlags(32);
                        return viewHolder;
                    }
                }
                if (RecyclerView.this.n.mHasStableIds && (a2 = RecyclerView.this.f3813g.a(i2, 0)) > 0 && a2 < RecyclerView.this.n.getItemCount()) {
                    long itemId = RecyclerView.this.n.getItemId(a2);
                    for (int i4 = 0; i4 < size; i4++) {
                        ViewHolder viewHolder2 = this.f3852b.get(i4);
                        if (!viewHolder2.wasReturnedFromScrap() && viewHolder2.getItemId() == itemId) {
                            viewHolder2.addFlags(32);
                            return viewHolder2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final void b(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.f3852b.remove(viewHolder);
            } else {
                this.f3851a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: package-private */
        public final void c(View view) {
            ViewHolder c2 = RecyclerView.c(view);
            if (!c2.hasAnyOfTheFlags(12) && c2.isUpdated() && !RecyclerView.this.b(c2)) {
                if (this.f3852b == null) {
                    this.f3852b = new ArrayList<>();
                }
                c2.setScrapContainer(this, true);
                this.f3852b.add(c2);
            } else if (!c2.isInvalid() || c2.isRemoved() || RecyclerView.this.n.mHasStableIds) {
                c2.setScrapContainer(this, false);
                this.f3851a.add(c2);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.a());
            }
        }

        private void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private ViewHolder a(int i2, boolean z) {
            int size = this.f3851a.size();
            for (int i3 = 0; i3 < size; i3++) {
                ViewHolder viewHolder = this.f3851a.get(i3);
                if (!viewHolder.wasReturnedFromScrap() && viewHolder.getLayoutPosition() == i2 && !viewHolder.isInvalid() && (RecyclerView.this.G.f3882g || !viewHolder.isRemoved())) {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!z) {
                f fVar = RecyclerView.this.f3814h;
                int size2 = fVar.f4022c.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        break;
                    }
                    View view = fVar.f4022c.get(i4);
                    ViewHolder b2 = fVar.f4020a.b(view);
                    if (b2.getLayoutPosition() != i2 || b2.isInvalid() || b2.isRemoved()) {
                        i4++;
                    } else if (view != null) {
                        ViewHolder c2 = RecyclerView.c(view);
                        f fVar2 = RecyclerView.this.f3814h;
                        int a2 = fVar2.f4020a.a(view);
                        if (a2 < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(view)));
                        } else if (fVar2.f4021b.c(a2)) {
                            fVar2.f4021b.b(a2);
                            fVar2.b(view);
                            int c3 = RecyclerView.this.f3814h.c(view);
                            if (c3 != -1) {
                                RecyclerView.this.f3814h.d(c3);
                                c(view);
                                c2.addFlags(8224);
                                return c2;
                            }
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + c2 + RecyclerView.this.a());
                        } else {
                            throw new RuntimeException("trying to unhide a view that was not hidden".concat(String.valueOf(view)));
                        }
                    }
                }
            }
            int size3 = this.f3853c.size();
            for (int i5 = 0; i5 < size3; i5++) {
                ViewHolder viewHolder2 = this.f3853c.get(i5);
                if (!viewHolder2.isInvalid() && viewHolder2.getLayoutPosition() == i2 && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (!z) {
                        this.f3853c.remove(i5);
                    }
                    return viewHolder2;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final void a(a aVar, a aVar2, boolean z) {
            a();
            c().onAdapterChanged(aVar, aVar2, z);
        }

        public static ViewHolder a(o oVar, int i2, long j2) {
            if (com.ss.android.ugc.aweme.lancet.c.f107188a == null) {
                com.ss.android.ugc.aweme.lancet.c.f107188a = Boolean.valueOf(SettingsManager.a().a("catch_tryGetViewHolderForPositionByDeadline_crash", true));
            }
            Boolean bool = com.ss.android.ugc.aweme.lancet.c.f107188a;
            if (bool == null) {
                h.f.b.l.b();
            }
            if (!bool.booleanValue()) {
                return oVar.a(i2, false, j2);
            }
            try {
                return oVar.a(i2, false, j2);
            } catch (IndexOutOfBoundsException e2) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("tryGetViewHolderForPositionByDeadline crash hook, error: ").append(e2.toString()).append(Arrays.toString(e2.getStackTrace()));
                gg.f143006b = stringBuffer.toString();
                return null;
            }
        }

        private ViewHolder a(long j2, int i2, boolean z) {
            for (int size = this.f3851a.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = this.f3851a.get(size);
                if (viewHolder.getItemId() == j2 && !viewHolder.wasReturnedFromScrap()) {
                    if (i2 == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.G.f3882g) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    } else if (!z) {
                        this.f3851a.remove(size);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        b(viewHolder.itemView);
                    }
                }
            }
            for (int size2 = this.f3853c.size() - 1; size2 >= 0; size2--) {
                ViewHolder viewHolder2 = this.f3853c.get(size2);
                if (viewHolder2.getItemId() == j2 && !viewHolder2.isAttachedToTransitionOverlay()) {
                    if (i2 == viewHolder2.getItemViewType()) {
                        if (!z) {
                            this.f3853c.remove(size2);
                        }
                        return viewHolder2;
                    } else if (!z) {
                        d(size2);
                        return null;
                    }
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private androidx.recyclerview.widget.RecyclerView.ViewHolder a(int r21, boolean r22, long r23) {
            /*
            // Method dump skipped, instructions count: 581
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$ViewHolder");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
            if (r1 != null) goto L_0x007e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10, int r11, long r12) {
            /*
            // Method dump skipped, instructions count: 140
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, long):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(ViewHolder viewHolder, int i2) {
        if (l()) {
            viewHolder.mPendingAccessibilityState = i2;
            this.M.add(viewHolder);
            return false;
        }
        v.a(viewHolder.itemView, i2);
        return true;
    }

    @Override // androidx.core.h.k
    public final void a(int i2) {
        getScrollingChildHelper().b(i2);
    }

    public final boolean a(int i2, int i3, int i4, int i5, int i6) {
        return getScrollingChildHelper().b(i2, i3, i4, i5, null, i6, null);
    }

    public final void a(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, i4);
    }

    public final void a(int i2, int i3) {
        a(i2, i3, false);
    }

    public static abstract class r {

        /* renamed from: a  reason: collision with root package name */
        private final a f3861a = new a();

        /* renamed from: g  reason: collision with root package name */
        public int f3862g = -1;

        /* renamed from: h  reason: collision with root package name */
        RecyclerView f3863h;

        /* renamed from: i  reason: collision with root package name */
        public i f3864i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f3865j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3866k;

        /* renamed from: l  reason: collision with root package name */
        View f3867l;

        /* renamed from: m  reason: collision with root package name */
        boolean f3868m;

        public interface b {
            static {
                Covode.recordClassIndex(1511);
            }

            PointF d(int i2);
        }

        static {
            Covode.recordClassIndex(1509);
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: protected */
        public abstract void a(int i2, int i3, a aVar);

        /* access modifiers changed from: protected */
        public abstract void a(View view, s sVar, a aVar);

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f3869a;

            /* renamed from: b  reason: collision with root package name */
            public int f3870b;

            /* renamed from: c  reason: collision with root package name */
            public int f3871c;

            /* renamed from: d  reason: collision with root package name */
            public int f3872d;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f3873e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f3874f;

            /* renamed from: g  reason: collision with root package name */
            private int f3875g;

            static {
                Covode.recordClassIndex(1510);
            }

            public a() {
                this((byte) 0);
            }

            private void a() {
                if (this.f3873e != null && this.f3871c <= 0) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3871c <= 0) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            private a(byte b2) {
                this.f3872d = -1;
                this.f3869a = 0;
                this.f3870b = 0;
                this.f3871c = Integer.MIN_VALUE;
                this.f3873e = null;
            }

            /* access modifiers changed from: package-private */
            public final void a(RecyclerView recyclerView) {
                int i2 = this.f3872d;
                if (i2 >= 0) {
                    this.f3872d = -1;
                    recyclerView.c(i2);
                    this.f3874f = false;
                } else if (this.f3874f) {
                    a();
                    recyclerView.D.a(this.f3869a, this.f3870b, this.f3871c, this.f3873e);
                    this.f3875g++;
                    this.f3874f = false;
                } else {
                    this.f3875g = 0;
                }
            }

            public final void a(int i2, int i3, int i4, Interpolator interpolator) {
                this.f3869a = i2;
                this.f3870b = i3;
                this.f3871c = i4;
                this.f3873e = interpolator;
                this.f3874f = true;
            }
        }

        /* access modifiers changed from: protected */
        public final void d() {
            if (this.f3866k) {
                this.f3866k = false;
                a();
                this.f3863h.G.f3876a = -1;
                this.f3867l = null;
                this.f3862g = -1;
                this.f3865j = false;
                i iVar = this.f3864i;
                if (iVar.z == this) {
                    iVar.z = null;
                }
                this.f3864i = null;
                this.f3863h = null;
            }
        }

        /* access modifiers changed from: protected */
        public final void a(View view) {
            if (RecyclerView.e(view) == this.f3862g) {
                this.f3867l = view;
            }
        }

        public PointF c(int i2) {
            i iVar = this.f3864i;
            if (iVar instanceof b) {
                return ((b) iVar).d(i2);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            PointF c2;
            RecyclerView recyclerView = this.f3863h;
            if (this.f3862g == -1 || recyclerView == null) {
                d();
            }
            if (!(!this.f3865j || this.f3867l != null || this.f3864i == null || (c2 = c(this.f3862g)) == null || (c2.x == 0.0f && c2.y == 0.0f))) {
                recyclerView.a((int) Math.signum(c2.x), (int) Math.signum(c2.y), (int[]) null);
            }
            boolean z = false;
            this.f3865j = false;
            View view = this.f3867l;
            if (view != null) {
                if (RecyclerView.e(view) == this.f3862g) {
                    a(this.f3867l, recyclerView.G, this.f3861a);
                    this.f3861a.a(recyclerView);
                    d();
                } else {
                    this.f3867l = null;
                }
            }
            if (this.f3866k) {
                a(i2, i3, this.f3861a);
                if (this.f3861a.f3872d >= 0) {
                    z = true;
                }
                this.f3861a.a(recyclerView);
                if (z && this.f3866k) {
                    this.f3865j = true;
                    recyclerView.D.a();
                }
            }
        }
    }

    public static class RecycledViewPool {
        private int mAttachCount = 0;
        public SparseArray<ScrapData> mScrap = new SparseArray<>();

        static {
            Covode.recordClassIndex(1479);
        }

        /* access modifiers changed from: package-private */
        public void attach() {
            this.mAttachCount++;
        }

        /* access modifiers changed from: package-private */
        public void detach() {
            this.mAttachCount--;
        }

        public static class ScrapData {
            long mBindRunningAverageNs = 0;
            long mCreateRunningAverageNs = 0;
            public int mMaxScrap = 5;
            final ArrayList<ViewHolder> mScrapHeap = new ArrayList<>();

            static {
                Covode.recordClassIndex(1480);
            }

            ScrapData() {
            }
        }

        public void clear() {
            for (int i2 = 0; i2 < this.mScrap.size(); i2++) {
                this.mScrap.valueAt(i2).mScrapHeap.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public int size() {
            int i2 = 0;
            for (int i3 = 0; i3 < this.mScrap.size(); i3++) {
                ArrayList<ViewHolder> arrayList = this.mScrap.valueAt(i3).mScrapHeap;
                if (arrayList != null) {
                    i2 += arrayList.size();
                }
            }
            return i2;
        }

        public int getRecycledViewCount(int i2) {
            return getScrapDataForType(i2).mScrapHeap.size();
        }

        private ScrapData getScrapDataForType(int i2) {
            ScrapData scrapData = this.mScrap.get(i2);
            if (scrapData != null) {
                return scrapData;
            }
            ScrapData scrapData2 = new ScrapData();
            this.mScrap.put(i2, scrapData2);
            return scrapData2;
        }

        public ViewHolder getRecycledView(int i2) {
            ScrapData scrapData = this.mScrap.get(i2);
            if (scrapData == null || scrapData.mScrapHeap.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> arrayList = scrapData.mScrapHeap;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public void putRecycledView(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = getScrapDataForType(itemViewType).mScrapHeap;
            if (this.mScrap.get(itemViewType).mMaxScrap > arrayList.size()) {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        /* access modifiers changed from: package-private */
        public void factorInBindTime(int i2, long j2) {
            ScrapData scrapDataForType = getScrapDataForType(i2);
            scrapDataForType.mBindRunningAverageNs = runningAverage(scrapDataForType.mBindRunningAverageNs, j2);
        }

        /* access modifiers changed from: package-private */
        public void factorInCreateTime(int i2, long j2) {
            ScrapData scrapDataForType = getScrapDataForType(i2);
            scrapDataForType.mCreateRunningAverageNs = runningAverage(scrapDataForType.mCreateRunningAverageNs, j2);
        }

        /* access modifiers changed from: package-private */
        public long runningAverage(long j2, long j3) {
            if (j2 == 0) {
                return j3;
            }
            return ((j2 / 4) * 3) + (j3 / 4);
        }

        public void setMaxRecycledViews(int i2, int i3) {
            ScrapData scrapDataForType = getScrapDataForType(i2);
            scrapDataForType.mMaxScrap = i3;
            ArrayList<ViewHolder> arrayList = scrapDataForType.mScrapHeap;
            while (arrayList.size() > i3) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* access modifiers changed from: package-private */
        public void onAdapterChanged(a aVar, a aVar2, boolean z) {
            if (aVar != null) {
                detach();
            }
            if (!z && this.mAttachCount == 0) {
                clear();
            }
            if (aVar2 != null) {
                attach();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean willBindInTime(int i2, long j2, long j3) {
            long j4 = getScrapDataForType(i2).mBindRunningAverageNs;
            if (j4 == 0 || j2 + j4 < j3) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean willCreateInTime(int i2, long j2, long j3) {
            long j4 = getScrapDataForType(i2).mCreateRunningAverageNs;
            if (j4 == 0 || j2 + j4 < j3) {
                return true;
            }
            return false;
        }
    }

    public static abstract class a<VH extends ViewHolder> {
        public boolean mHasStableIds = false;
        private final b mObservable = new b();
        public EnumC0056a mStateRestorationPolicy = EnumC0056a.ALLOW;

        static {
            Covode.recordClassIndex(1484);
        }

        public int findRelativeAdapterPositionIn(a<? extends ViewHolder> aVar, ViewHolder viewHolder, int i2) {
            if (aVar == this) {
                return i2;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i2) {
            return -1;
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i2);

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i2);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        /* access modifiers changed from: package-private */
        public boolean canRestoreState() {
            int i2 = AnonymousClass7.f3825a[this.mStateRestorationPolicy.ordinal()];
            if (i2 == 1 || (i2 == 2 && getItemCount() <= 0)) {
                return false;
            }
            return true;
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$a$a  reason: collision with other inner class name */
        public enum EnumC0056a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT;

            static {
                Covode.recordClassIndex(1485);
            }
        }

        public final void notifyItemChanged(int i2) {
            this.mObservable.a(i2, 1);
        }

        public final void notifyItemInserted(int i2) {
            this.mObservable.b(i2, 1);
        }

        public final void notifyItemRemoved(int i2) {
            this.mObservable.c(i2, 1);
        }

        public void registerAdapterDataObserver(c cVar) {
            this.mObservable.registerObserver(cVar);
        }

        public void setStateRestorationPolicy(EnumC0056a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.c();
        }

        public void unregisterAdapterDataObserver(c cVar) {
            this.mObservable.unregisterObserver(cVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public final void notifyItemMoved(int i2, int i3) {
            this.mObservable.d(i2, i3);
        }

        public final void notifyItemRangeChanged(int i2, int i3) {
            this.mObservable.a(i2, i3);
        }

        public final void notifyItemRangeInserted(int i2, int i3) {
            this.mObservable.b(i2, i3);
        }

        public final void notifyItemRangeRemoved(int i2, int i3) {
            this.mObservable.c(i2, i3);
        }

        public final void notifyItemChanged(int i2, Object obj) {
            this.mObservable.a(i2, 1, obj);
        }

        public final void bindViewHolder(VH vh, int i2) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
                vh.mPosition = i2;
                if (this.mHasStableIds) {
                    vh.mItemId = getItemId(i2);
                }
                vh.setFlags(1, 519);
                androidx.core.d.g.a("RV OnBindView");
            } else {
                z = false;
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i2, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof j) {
                    ((j) layoutParams).f3849e = true;
                }
                androidx.core.d.g.a();
            }
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i2) {
            try {
                androidx.core.d.g.a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i2);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i2;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                androidx.core.d.g.a();
            }
        }

        public void onBindViewHolder(VH vh, int i2, List<Object> list) {
            onBindViewHolder(vh, i2);
        }

        public final void notifyItemRangeChanged(int i2, int i3, Object obj) {
            this.mObservable.a(i2, i3, obj);
        }
    }

    public static class j extends ViewGroup.MarginLayoutParams {

        /* renamed from: c  reason: collision with root package name */
        public ViewHolder f3847c;

        /* renamed from: d  reason: collision with root package name */
        final Rect f3848d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        boolean f3849e = true;

        /* renamed from: f  reason: collision with root package name */
        boolean f3850f = false;

        static {
            Covode.recordClassIndex(1501);
        }

        public final boolean A_() {
            return this.f3847c.isInvalid();
        }

        public final boolean B_() {
            return this.f3847c.isRemoved();
        }

        public final int C_() {
            return this.f3847c.getBindingAdapterPosition();
        }

        public j(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public j(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public j(j jVar) {
            super((ViewGroup.LayoutParams) jVar);
        }

        public j(int i2, int i3) {
            super(i2, i3);
        }

        public j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    private void y() {
        x();
        setScrollState(0);
    }

    public final void c() {
        List<k> list = this.z;
        if (list != null) {
            list.clear();
        }
    }

    public final void f() {
        List<n> list = this.az;
        if (list != null) {
            list.clear();
        }
    }

    public int getItemDecorationCount() {
        return this.r.size();
    }

    public RecycledViewPool getRecycledViewPool() {
        return this.f3811e.c();
    }

    public final void i() {
        setScrollState(0);
        q();
    }

    @Override // androidx.core.h.j
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f2548a;
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.ad++;
    }

    public final boolean l() {
        if (this.ad > 0) {
            return true;
        }
        return false;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.recyclerview.widget.RecyclerView.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1482);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        Parcelable f3826a;

        static {
            Covode.recordClassIndex(1481);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f3826a, 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3826a = parcel.readParcelable(classLoader == null ? i.class.getClassLoader() : classLoader);
        }
    }

    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public int f3876a = -1;

        /* renamed from: b  reason: collision with root package name */
        int f3877b;

        /* renamed from: c  reason: collision with root package name */
        int f3878c;

        /* renamed from: d  reason: collision with root package name */
        int f3879d = 1;

        /* renamed from: e  reason: collision with root package name */
        int f3880e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3881f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3882g;

        /* renamed from: h  reason: collision with root package name */
        boolean f3883h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3884i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f3885j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3886k;

        /* renamed from: l  reason: collision with root package name */
        int f3887l;

        /* renamed from: m  reason: collision with root package name */
        long f3888m;
        int n;
        public int o;
        public int p;
        private SparseArray<Object> q;

        static {
            Covode.recordClassIndex(1512);
        }

        public final int a() {
            if (this.f3882g) {
                return this.f3877b - this.f3878c;
            }
            return this.f3880e;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3876a + ", mData=" + this.q + ", mItemCount=" + this.f3880e + ", mIsMeasuring=" + this.f3884i + ", mPreviousLayoutItemCount=" + this.f3877b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3878c + ", mStructureChanged=" + this.f3881f + ", mInPreLayout=" + this.f3882g + ", mRunSimpleAnimations=" + this.f3885j + ", mRunPredictiveAnimations=" + this.f3886k + '}';
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2) {
            if ((this.f3879d & i2) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f3879d));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        int f3889a;

        /* renamed from: b  reason: collision with root package name */
        int f3890b;

        /* renamed from: c  reason: collision with root package name */
        OverScroller f3891c;

        /* renamed from: d  reason: collision with root package name */
        Interpolator f3892d = RecyclerView.N;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3894f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f3895g;

        static {
            Covode.recordClassIndex(1514);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            v.a(RecyclerView.this, this);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (this.f3894f) {
                this.f3895g = true;
            } else {
                c();
            }
        }

        public final void b() {
            RecyclerView.this.removeCallbacks(this);
            this.f3891c.abortAnimation();
        }

        public final void run() {
            int i2;
            int i3;
            boolean z;
            boolean z2;
            boolean z3;
            int i4;
            if (RecyclerView.this.o == null) {
                b();
                return;
            }
            this.f3895g = false;
            this.f3894f = true;
            RecyclerView.this.g();
            OverScroller overScroller = this.f3891c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.f3889a;
                int i6 = currY - this.f3890b;
                this.f3889a = currX;
                this.f3890b = currY;
                RecyclerView.this.L[0] = 0;
                RecyclerView.this.L[1] = 0;
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.a(i5, i6, recyclerView.L, (int[]) null, 1)) {
                    i5 -= RecyclerView.this.L[0];
                    i6 -= RecyclerView.this.L[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.c(i5, i6);
                }
                if (RecyclerView.this.n != null) {
                    RecyclerView.this.L[0] = 0;
                    RecyclerView.this.L[1] = 0;
                    RecyclerView recyclerView2 = RecyclerView.this;
                    recyclerView2.a(i5, i6, recyclerView2.L);
                    i2 = RecyclerView.this.L[0];
                    i3 = RecyclerView.this.L[1];
                    i5 -= i2;
                    i6 -= i3;
                    r rVar = RecyclerView.this.o.z;
                    if (rVar != null && !rVar.f3865j && rVar.f3866k) {
                        int a2 = RecyclerView.this.G.a();
                        if (a2 == 0) {
                            rVar.d();
                        } else {
                            if (rVar.f3862g >= a2) {
                                rVar.f3862g = a2 - 1;
                            }
                            rVar.a(i2, i3);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.r.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView.this.L[0] = 0;
                RecyclerView.this.L[1] = 0;
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.a(i2, i3, i5, i6, null, 1, recyclerView3.L);
                int i7 = i5 - RecyclerView.this.L[0];
                int i8 = i6 - RecyclerView.this.L[1];
                if (!(i2 == 0 && i3 == 0)) {
                    RecyclerView.this.f(i2, i3);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (overScroller.isFinished() || ((z || i7 != 0) && (z2 || i8 != 0))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r rVar2 = RecyclerView.this.o.z;
                if ((rVar2 == null || !rVar2.f3865j) && z3) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i7 < 0) {
                            i4 = -currVelocity;
                        } else if (i7 > 0) {
                            i4 = currVelocity;
                        } else {
                            i4 = 0;
                        }
                        if (i8 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i8 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.d(i4, currVelocity);
                    }
                    if (RecyclerView.f3810d) {
                        RecyclerView.this.F.a();
                    }
                } else {
                    a();
                    if (RecyclerView.this.E != null) {
                        RecyclerView.this.E.a(RecyclerView.this, i2, i3);
                    }
                }
            }
            r rVar3 = RecyclerView.this.o.z;
            if (rVar3 != null && rVar3.f3865j) {
                rVar3.a(0, 0);
            }
            this.f3894f = false;
            if (this.f3895g) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.a(1);
        }

        u() {
            this.f3891c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.N);
        }

        private int a(int i2, int i3) {
            boolean z;
            int height;
            int abs = Math.abs(i2);
            int abs2 = Math.abs(i3);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) height)) + 1.0f) * 300.0f), (int) LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        }

        public final void a(int i2, int i3, int i4, Interpolator interpolator) {
            int i5 = i4;
            if (i5 == Integer.MIN_VALUE) {
                i5 = a(i2, i3);
            }
            if (interpolator == null) {
                interpolator = RecyclerView.N;
            }
            if (this.f3892d != interpolator) {
                this.f3892d = interpolator;
                this.f3891c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3890b = 0;
            this.f3889a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3891c.startScroll(0, 0, i2, i3, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3891c.computeScrollOffset();
            }
            a();
        }
    }

    private boolean A() {
        if (this.C == null || !this.o.x_()) {
            return false;
        }
        return true;
    }

    private void E() {
        this.G.f3888m = -1;
        this.G.f3887l = -1;
        this.G.n = -1;
    }

    private androidx.core.h.m getScrollingChildHelper() {
        if (this.aD == null) {
            this.aD = new androidx.core.h.m(this);
        }
        return this.aD;
    }

    private void q() {
        this.D.b();
        i iVar = this.o;
        if (iVar != null) {
            iVar.B();
        }
    }

    private void w() {
        this.aj = null;
        this.ah = null;
        this.ai = null;
        this.ag = null;
    }

    private void x() {
        VelocityTracker velocityTracker = this.am;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        a(0);
        r();
    }

    public int getBaseline() {
        if (this.o != null) {
            return -1;
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f3810d) {
            return System.nanoTime();
        }
        return 0;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().a(0);
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        AccessibilityManager accessibilityManager = this.ac;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        return true;
    }

    public final boolean n() {
        f fVar = this.C;
        if (fVar == null || !fVar.b()) {
            return false;
        }
        return true;
    }

    public void requestLayout() {
        if (this.W != 0 || this.x) {
            this.w = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // androidx.core.h.j
    public void stopNestedScroll() {
        getScrollingChildHelper().b(0);
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<a> f3828a = new ArrayList<>();

        /* renamed from: h  reason: collision with root package name */
        public b f3829h;

        /* renamed from: i  reason: collision with root package name */
        public long f3830i = 120;

        /* renamed from: j  reason: collision with root package name */
        public long f3831j = 120;

        /* renamed from: k  reason: collision with root package name */
        public long f3832k = 250;

        /* renamed from: l  reason: collision with root package name */
        public long f3833l = 250;

        public interface a {
            static {
                Covode.recordClassIndex(1491);
            }

            void a();
        }

        interface b {
            static {
                Covode.recordClassIndex(1492);
            }

            void a(ViewHolder viewHolder);
        }

        static {
            Covode.recordClassIndex(1490);
        }

        public abstract void a();

        public abstract boolean a(ViewHolder viewHolder, ViewHolder viewHolder2, c cVar, c cVar2);

        public abstract boolean a(ViewHolder viewHolder, c cVar, c cVar2);

        public abstract boolean b();

        public abstract boolean b(ViewHolder viewHolder, c cVar, c cVar2);

        public abstract void c(ViewHolder viewHolder);

        public abstract boolean c(ViewHolder viewHolder, c cVar, c cVar2);

        public abstract void d();

        public boolean g(ViewHolder viewHolder) {
            return true;
        }

        public final void e() {
            int size = this.f3828a.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3828a.get(i2).a();
            }
            this.f3828a.clear();
        }

        public final void f(ViewHolder viewHolder) {
            b bVar = this.f3829h;
            if (bVar != null) {
                bVar.a(viewHolder);
            }
        }

        public static c d(ViewHolder viewHolder) {
            return new c().a(viewHolder);
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f3834a;

            /* renamed from: b  reason: collision with root package name */
            public int f3835b;

            /* renamed from: c  reason: collision with root package name */
            public int f3836c;

            /* renamed from: d  reason: collision with root package name */
            public int f3837d;

            static {
                Covode.recordClassIndex(1493);
            }

            public final c a(ViewHolder viewHolder) {
                View view = viewHolder.itemView;
                this.f3834a = view.getLeft();
                this.f3835b = view.getTop();
                this.f3836c = view.getRight();
                this.f3837d = view.getBottom();
                return this;
            }
        }

        static int e(ViewHolder viewHolder) {
            int i2 = viewHolder.mFlags & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int oldPosition = viewHolder.getOldPosition();
            int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
            if (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) {
                return i2;
            }
            return i2 | 2048;
        }

        public final boolean a(a aVar) {
            boolean b2 = b();
            if (aVar != null) {
                if (!b2) {
                    aVar.a();
                } else {
                    this.f3828a.add(aVar);
                }
            }
            return b2;
        }

        public boolean a(ViewHolder viewHolder, List<Object> list) {
            return g(viewHolder);
        }
    }

    /* access modifiers changed from: package-private */
    public class q extends c {
        static {
            Covode.recordClassIndex(1508);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b() {
            a aVar;
            if (RecyclerView.this.f3812f != null && (aVar = RecyclerView.this.n) != null && aVar.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        private void c() {
            if (!RecyclerView.f3809c || !RecyclerView.this.t || !RecyclerView.this.s) {
                RecyclerView.this.y = true;
                RecyclerView.this.requestLayout();
                return;
            }
            RecyclerView recyclerView = RecyclerView.this;
            v.a(recyclerView, recyclerView.f3817k);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a() {
            RecyclerView.this.d_(null);
            RecyclerView.this.G.f3881f = true;
            RecyclerView.this.c(true);
            if (!RecyclerView.this.f3813g.d()) {
                RecyclerView.this.requestLayout();
            }
        }

        q() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void b(int i2, int i3) {
            RecyclerView.this.d_(null);
            a aVar = RecyclerView.this.f3813g;
            if (i3 > 0) {
                aVar.f3941a.add(aVar.a(1, i2, i3, null));
                aVar.f3947g |= 1;
                if (aVar.f3941a.size() == 1) {
                    c();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void c(int i2, int i3) {
            RecyclerView.this.d_(null);
            a aVar = RecyclerView.this.f3813g;
            if (i3 > 0) {
                aVar.f3941a.add(aVar.a(2, i2, i3, null));
                aVar.f3947g |= 2;
                if (aVar.f3941a.size() == 1) {
                    c();
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, int i4) {
            RecyclerView.this.d_(null);
            a aVar = RecyclerView.this.f3813g;
            if (i2 == i3) {
                return;
            }
            if (i4 == 1) {
                aVar.f3941a.add(aVar.a(8, i2, i3, null));
                aVar.f3947g |= 8;
                if (aVar.f3941a.size() == 1) {
                    c();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.c
        public final void a(int i2, int i3, Object obj) {
            RecyclerView.this.d_(null);
            a aVar = RecyclerView.this.f3813g;
            if (i3 > 0) {
                aVar.f3941a.add(aVar.a(4, i2, i3, obj));
                aVar.f3947g |= 4;
                if (aVar.f3941a.size() == 1) {
                    c();
                }
            }
        }
    }

    private void K() {
        int b2 = this.f3814h.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ViewHolder c2 = c(this.f3814h.c(i2));
            if (!c2.shouldIgnore()) {
                c2.saveOldPosition();
            }
        }
    }

    private void z() {
        int i2 = this.ab;
        this.ab = 0;
        if (i2 != 0 && k()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            androidx.core.h.a.b.a(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public int computeHorizontalScrollExtent() {
        i iVar = this.o;
        if (iVar != null && iVar.f()) {
            return this.o.f(this.G);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        i iVar = this.o;
        if (iVar != null && iVar.f()) {
            return this.o.d(this.G);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        i iVar = this.o;
        if (iVar != null && iVar.f()) {
            return this.o.b(this.G);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        i iVar = this.o;
        if (iVar != null && iVar.g()) {
            return this.o.g(this.G);
        }
        return 0;
    }

    @Override // androidx.core.h.t
    public int computeVerticalScrollOffset() {
        i iVar = this.o;
        if (iVar != null && iVar.g()) {
            return this.o.e(this.G);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        i iVar = this.o;
        if (iVar != null && iVar.g()) {
            return this.o.c(this.G);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        int i2 = this.W + 1;
        this.W = i2;
        if (i2 == 1 && !this.x) {
            this.w = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        if (!this.J && this.s) {
            v.a(this, this.aG);
            this.J = true;
        }
    }

    public final void o() {
        if (this.r.size() != 0) {
            i iVar = this.o;
            if (iVar != null) {
                iVar.a("Cannot invalidate item decorations during a scroll or layout");
            }
            J();
            requestLayout();
        }
    }

    public final boolean p() {
        if (!this.v || this.A || this.f3813g.d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.RecyclerView$7  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3825a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 1478(0x5c6, float:2.071E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.recyclerview.widget.RecyclerView$a$a[] r0 = androidx.recyclerview.widget.RecyclerView.a.EnumC0056a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                androidx.recyclerview.widget.RecyclerView.AnonymousClass7.f3825a = r2
                androidx.recyclerview.widget.RecyclerView$a$a r0 = androidx.recyclerview.widget.RecyclerView.a.EnumC0056a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = androidx.recyclerview.widget.RecyclerView.AnonymousClass7.f3825a     // Catch:{ NoSuchFieldError -> 0x0022 }
                androidx.recyclerview.widget.RecyclerView$a$a r0 = androidx.recyclerview.widget.RecyclerView.a.EnumC0056a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AnonymousClass7.<clinit>():void");
        }
    }

    private void J() {
        int b2 = this.f3814h.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((j) this.f3814h.c(i2).getLayoutParams()).f3849e = true;
        }
        this.f3811e.f();
    }

    private void L() {
        int b2 = this.f3814h.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ViewHolder c2 = c(this.f3814h.c(i2));
            if (!c2.shouldIgnore()) {
                c2.clearOldPosition();
            }
        }
        this.f3811e.e();
    }

    private void M() {
        int b2 = this.f3814h.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ViewHolder c2 = c(this.f3814h.c(i2));
            if (c2 != null && !c2.shouldIgnore()) {
                c2.addFlags(6);
            }
        }
        J();
        this.f3811e.d();
    }

    private void N() {
        int i2;
        for (int size = this.M.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = this.M.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i2 = viewHolder.mPendingAccessibilityState) != -1) {
                v.a(viewHolder.itemView, i2);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.M.clear();
    }

    private void r() {
        boolean z2;
        EdgeEffect edgeEffect = this.ag;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.ag.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.ah;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.ah.isFinished();
        }
        EdgeEffect edgeEffect3 = this.ai;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.ai.isFinished();
        }
        EdgeEffect edgeEffect4 = this.aj;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.aj.isFinished();
        }
        if (z2) {
            v.c(this);
        }
    }

    private void s() {
        if (this.ag == null) {
            EdgeEffect a2 = e.a(this);
            this.ag = a2;
            if (this.f3816j) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    private void t() {
        if (this.ai == null) {
            EdgeEffect a2 = e.a(this);
            this.ai = a2;
            if (this.f3816j) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    private void u() {
        if (this.ah == null) {
            EdgeEffect a2 = e.a(this);
            this.ah = a2;
            if (this.f3816j) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private void v() {
        if (this.aj == null) {
            EdgeEffect a2 = e.a(this);
            this.aj = a2;
            if (this.f3816j) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final h d() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount > 0) {
            return this.r.get(0);
        }
        throw new IndexOutOfBoundsException("0 is an invalid index for size " + itemDecorationCount);
    }

    public final void e() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount > 0) {
            c(d());
            return;
        }
        throw new IndexOutOfBoundsException("0 is an invalid index for size ".concat(String.valueOf(itemDecorationCount)));
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        i iVar = this.o;
        if (iVar != null) {
            return iVar.b();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    public void onDetachedFromWindow() {
        m mVar;
        super.onDetachedFromWindow();
        f fVar = this.C;
        if (fVar != null) {
            fVar.d();
        }
        i();
        this.s = false;
        i iVar = this.o;
        if (iVar != null) {
            iVar.b(this, this.f3811e);
        }
        this.M.clear();
        removeCallbacks(this.aG);
        do {
        } while (af.a.f3976d.acquire() != null);
        if (f3810d && (mVar = this.E) != null) {
            mVar.f4138b.remove(this);
            this.E = null;
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f3812f;
        if (savedState2 != null) {
            savedState.f3826a = savedState2.f3826a;
        } else {
            i iVar = this.o;
            if (iVar != null) {
                savedState.f3826a = iVar.e();
            } else {
                savedState.f3826a = null;
            }
        }
        return savedState;
    }

    static {
        boolean z2;
        boolean z3;
        boolean z4;
        Covode.recordClassIndex(1471);
        if (Build.VERSION.SDK_INT == 18 || Build.VERSION.SDK_INT == 19 || Build.VERSION.SDK_INT == 20) {
            z2 = true;
        } else {
            z2 = false;
        }
        f3807a = z2;
        if (Build.VERSION.SDK_INT >= 23) {
            z3 = true;
        } else {
            z3 = false;
        }
        f3808b = z3;
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 21) {
            z4 = true;
        } else {
            z4 = false;
        }
        f3810d = z4;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = Build.VERSION.SDK_INT;
    }

    private void B() {
        boolean z2;
        boolean z3;
        if (this.A) {
            this.f3813g.a();
            if (this.B) {
                this.o.y_();
            }
        }
        if (A()) {
            this.f3813g.b();
        } else {
            this.f3813g.e();
        }
        boolean z4 = false;
        if (this.H || this.I) {
            z2 = true;
        } else {
            z2 = false;
        }
        s sVar = this.G;
        if (!this.v || this.C == null || ((!this.A && !z2 && !this.o.A) || (this.A && !this.n.mHasStableIds))) {
            z3 = false;
        } else {
            z3 = true;
        }
        sVar.f3885j = z3;
        s sVar2 = this.G;
        if (sVar2.f3885j && z2 && !this.A && A()) {
            z4 = true;
        }
        sVar2.f3886k = z4;
    }

    private void C() {
        boolean z2;
        if (this.n != null && this.o != null) {
            this.G.f3884i = false;
            if (!this.aH || (this.aI == getWidth() && this.aJ == getHeight())) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.aI = 0;
            this.aJ = 0;
            this.aH = false;
            if (this.G.f3879d == 1) {
                G();
                this.o.d(this);
                H();
            } else if (this.f3813g.f() || z2 || this.o.J != getWidth() || this.o.K != getHeight()) {
                this.o.d(this);
                H();
            } else {
                this.o.d(this);
            }
            I();
        }
    }

    private void D() {
        View focusedChild;
        View b2;
        ViewHolder a2;
        long j2;
        int absoluteAdapterPosition;
        if (!this.ax || !hasFocus() || this.n == null || (focusedChild = getFocusedChild()) == null || (b2 = b(focusedChild)) == null || (a2 = a(b2)) == null) {
            E();
            return;
        }
        s sVar = this.G;
        if (this.n.mHasStableIds) {
            j2 = a2.getItemId();
        } else {
            j2 = -1;
        }
        sVar.f3888m = j2;
        s sVar2 = this.G;
        if (this.A) {
            absoluteAdapterPosition = -1;
        } else if (a2.isRemoved()) {
            absoluteAdapterPosition = a2.mOldPosition;
        } else {
            absoluteAdapterPosition = a2.getAbsoluteAdapterPosition();
        }
        sVar2.f3887l = absoluteAdapterPosition;
        s sVar3 = this.G;
        View view = a2.itemView;
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        sVar3.n = id;
    }

    private void H() {
        boolean z2;
        h();
        j();
        this.G.a(6);
        this.f3813g.e();
        this.G.f3880e = this.n.getItemCount();
        this.G.f3878c = 0;
        if (this.f3812f != null && this.n.canRestoreState()) {
            if (this.f3812f.f3826a != null) {
                this.o.a(this.f3812f.f3826a);
            }
            this.f3812f = null;
        }
        this.G.f3882g = false;
        this.o.c(this.f3811e, this.G);
        this.G.f3881f = false;
        s sVar = this.G;
        if (!sVar.f3885j || this.C == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        sVar.f3885j = z2;
        this.G.f3879d = 4;
        b(true);
        a(false);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        f fVar = this.C;
        if (fVar != null) {
            fVar.d();
        }
        i iVar = this.o;
        if (iVar != null) {
            iVar.c(this.f3811e);
            this.o.b(this.f3811e);
        }
        this.f3811e.a();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ad = 0;
        boolean z2 = true;
        this.s = true;
        if (!this.v || isLayoutRequested()) {
            z2 = false;
        }
        this.v = z2;
        i iVar = this.o;
        if (iVar != null) {
            iVar.b(this);
        }
        this.J = false;
        if (f3810d) {
            m mVar = m.f4136a.get();
            this.E = mVar;
            if (mVar == null) {
                this.E = new m();
                Display z3 = v.z(this);
                float f2 = 60.0f;
                if (!isInEditMode() && z3 != null) {
                    float refreshRate = z3.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                this.E.f4140d = (long) (1.0E9f / f2);
                m.f4136a.set(this.E);
            }
            this.E.f4138b.add(this);
        }
    }

    private void I() {
        this.G.a(4);
        h();
        j();
        this.G.f3879d = 1;
        if (this.G.f3885j) {
            for (int a2 = this.f3814h.a() - 1; a2 >= 0; a2--) {
                ViewHolder c2 = c(this.f3814h.b(a2));
                if (!c2.shouldIgnore()) {
                    long e2 = e(c2);
                    f.c a3 = new f.c().a(c2);
                    ViewHolder a4 = this.f3815i.a(e2);
                    if (a4 != null && !a4.shouldIgnore()) {
                        boolean a5 = this.f3815i.a(a4);
                        boolean a6 = this.f3815i.a(c2);
                        if (!a5 || a4 != c2) {
                            f.c a7 = this.f3815i.a(a4, 4);
                            this.f3815i.c(c2, a3);
                            f.c a8 = this.f3815i.a(c2, 8);
                            if (a7 == null) {
                                a(e2, c2);
                            } else {
                                a(a4, c2, a7, a8, a5, a6);
                            }
                        }
                    }
                    this.f3815i.c(c2, a3);
                }
            }
            this.f3815i.a(this.aK);
        }
        this.o.b(this.f3811e);
        s sVar = this.G;
        sVar.f3877b = sVar.f3880e;
        this.A = false;
        this.B = false;
        this.G.f3885j = false;
        this.G.f3886k = false;
        this.o.A = false;
        if (this.f3811e.f3852b != null) {
            this.f3811e.f3852b.clear();
        }
        if (this.o.G) {
            this.o.F = 0;
            this.o.G = false;
            this.f3811e.b();
        }
        this.o.a(this.G);
        b(true);
        a(false);
        this.f3815i.a();
        int[] iArr = this.aC;
        if (g(iArr[0], iArr[1])) {
            f(0, 0);
        }
        F();
        E();
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (!this.v || this.A) {
            androidx.core.d.g.a("RV FullInvalidate");
            C();
            androidx.core.d.g.a();
        } else if (this.f3813g.d()) {
            if (this.f3813g.a(4) && !this.f3813g.a(11)) {
                androidx.core.d.g.a("RV PartialInvalidate");
                h();
                j();
                this.f3813g.b();
                if (!this.w) {
                    int a2 = this.f3814h.a();
                    int i2 = 0;
                    while (true) {
                        if (i2 < a2) {
                            ViewHolder c2 = c(this.f3814h.b(i2));
                            if (c2 != null && !c2.shouldIgnore() && c2.isUpdated()) {
                                C();
                                break;
                            }
                            i2++;
                        } else {
                            this.f3813g.c();
                            break;
                        }
                    }
                }
                a(true);
                b(true);
                androidx.core.d.g.a();
            } else if (this.f3813g.d()) {
                androidx.core.d.g.a("RV FullInvalidate");
                C();
                androidx.core.d.g.a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0111, code lost:
        if (r8 != null) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void F() {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.F():void");
    }

    private void G() {
        boolean z2;
        this.G.a(1);
        a(this.G);
        this.G.f3884i = false;
        h();
        this.f3815i.a();
        j();
        B();
        D();
        s sVar = this.G;
        if (!sVar.f3885j || !this.I) {
            z2 = false;
        } else {
            z2 = true;
        }
        sVar.f3883h = z2;
        this.I = false;
        this.H = false;
        s sVar2 = this.G;
        sVar2.f3882g = sVar2.f3886k;
        this.G.f3880e = this.n.getItemCount();
        a(this.aC);
        if (this.G.f3885j) {
            int a2 = this.f3814h.a();
            for (int i2 = 0; i2 < a2; i2++) {
                ViewHolder c2 = c(this.f3814h.b(i2));
                if (!c2.shouldIgnore() && (!c2.isInvalid() || this.n.mHasStableIds)) {
                    f.e(c2);
                    c2.getUnmodifiedPayloads();
                    this.f3815i.a(c2, new f.c().a(c2));
                    if (this.G.f3883h && c2.isUpdated() && !c2.isRemoved() && !c2.shouldIgnore() && !c2.isInvalid()) {
                        this.f3815i.a(e(c2), c2);
                    }
                }
            }
        }
        if (this.G.f3886k) {
            K();
            boolean z3 = this.G.f3881f;
            this.G.f3881f = false;
            this.o.c(this.f3811e, this.G);
            this.G.f3881f = z3;
            for (int i3 = 0; i3 < this.f3814h.a(); i3++) {
                ViewHolder c3 = c(this.f3814h.b(i3));
                if (!c3.shouldIgnore() && !this.f3815i.b(c3)) {
                    f.e(c3);
                    boolean hasAnyOfTheFlags = c3.hasAnyOfTheFlags(8192);
                    c3.getUnmodifiedPayloads();
                    f.c a3 = new f.c().a(c3);
                    if (hasAnyOfTheFlags) {
                        a(c3, a3);
                    } else {
                        this.f3815i.b(c3, a3);
                    }
                }
            }
            L();
        } else {
            L();
        }
        b(true);
        a(false);
        this.G.f3879d = 2;
    }

    public final void b(h hVar) {
        a(hVar);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void setHasFixedSize(boolean z2) {
        this.t = z2;
    }

    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setOnFlingListener(l lVar) {
        this.as = lVar;
    }

    public void setOnScrollListener(n nVar) {
        this.ay = nVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.ax = z2;
    }

    public void setRecyclerListener(p pVar) {
        this.p = pVar;
    }

    class g implements f.b {
        static {
            Covode.recordClassIndex(1494);
        }

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f.b
        public final void a(ViewHolder viewHolder) {
            boolean z = true;
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (!viewHolder.shouldBeKeptAsChild()) {
                RecyclerView recyclerView = RecyclerView.this;
                View view = viewHolder.itemView;
                recyclerView.h();
                f fVar = recyclerView.f3814h;
                int a2 = fVar.f4020a.a(view);
                if (a2 == -1) {
                    fVar.b(view);
                } else if (fVar.f4021b.c(a2)) {
                    fVar.f4021b.d(a2);
                    fVar.b(view);
                    fVar.f4020a.a(a2);
                } else {
                    z = false;
                    recyclerView.a(!z);
                    if (!z && viewHolder.isTmpDetached()) {
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        return;
                    }
                }
                ViewHolder c2 = RecyclerView.c(view);
                recyclerView.f3811e.b(c2);
                recyclerView.f3811e.a(c2);
                recyclerView.a(!z);
                if (!z) {
                }
            }
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public final void b(n nVar) {
        List<n> list = this.az;
        if (list != null) {
            list.remove(nVar);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final ViewHolder e(int i2) {
        return a(i2, false);
    }

    public void setAccessibilityDelegateCompat(z zVar) {
        this.K = zVar;
        v.a(this, zVar);
    }

    public void setItemViewCacheSize(int i2) {
        o oVar = this.f3811e;
        oVar.f3855e = i2;
        oVar.b();
    }

    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().a(z2);
    }

    public void setViewCacheExtension(t tVar) {
        this.f3811e.f3858h = tVar;
    }

    public static class e {
        static {
            Covode.recordClassIndex(1489);
        }

        protected static EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    static ViewHolder c(View view) {
        if (view == null) {
            return null;
        }
        return ((j) view.getLayoutParams()).f3847c;
    }

    public static int d(View view) {
        ViewHolder c2 = c(view);
        if (c2 != null) {
            return c2.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static int e(View view) {
        ViewHolder c2 = c(view);
        if (c2 != null) {
            return c2.getLayoutPosition();
        }
        return -1;
    }

    public final void b(k kVar) {
        List<k> list = this.z;
        if (list != null) {
            list.remove(kVar);
        }
    }

    public void setAdapter(a aVar) {
        setLayoutFrozen(false);
        a(aVar, false, true);
        c(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(d dVar) {
        boolean z2;
        if (dVar != this.aB) {
            this.aB = dVar;
            if (dVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            setChildrenDrawingOrderEnabled(z2);
        }
    }

    public void setEdgeEffectFactory(e eVar) {
        androidx.core.g.g.a(eVar);
        this.af = eVar;
        w();
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().a(i2, 0);
    }

    private long e(ViewHolder viewHolder) {
        if (this.n.mHasStableIds) {
            return viewHolder.getItemId();
        }
        return (long) viewHolder.mPosition;
    }

    public final View b(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        if (this.o != null) {
            setScrollState(2);
            this.o.e(i2);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof j) || !this.o.a((j) layoutParams)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int d(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        return this.f3813g.c(viewHolder.mPosition);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.r.get(i2).onDraw(canvas, this, this.G);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f3812f = savedState;
        super.onRestoreInstanceState(savedState.f2667d);
        requestLayout();
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.U.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.U.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (l()) {
            if (accessibilityEvent != null) {
                int i3 = Build.VERSION.SDK_INT;
                int contentChangeTypes = accessibilityEvent.getContentChangeTypes();
                if (contentChangeTypes != 0) {
                    i2 = contentChangeTypes;
                }
            }
            this.ab |= i2;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.f3816j) {
            w();
        }
        this.f3816j = z2;
        super.setClipToPadding(z2);
        if (this.v) {
            requestLayout();
        }
    }

    public void setItemAnimator(f fVar) {
        f fVar2 = this.C;
        if (fVar2 != null) {
            fVar2.d();
            this.C.f3829h = null;
        }
        this.C = fVar;
        if (fVar != null) {
            fVar.f3829h = this.aA;
        }
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        int i2 = Build.VERSION.SDK_INT;
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
        o oVar = this.f3811e;
        if (oVar.f3857g != null) {
            oVar.f3857g.detach();
        }
        oVar.f3857g = recycledViewPool;
        if (oVar.f3857g != null && RecyclerView.this.getAdapter() != null) {
            oVar.f3857g.attach();
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 1) {
            this.ar = viewConfiguration.getScaledTouchSlop();
        } else {
            this.ar = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    private void b(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.al) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.al = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.ap = x2;
            this.an = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.aq = y2;
            this.ao = y2;
        }
    }

    static void c(ViewHolder viewHolder) {
        if (viewHolder.mNestedRecyclerView != null) {
            RecyclerView recyclerView = viewHolder.mNestedRecyclerView.get();
            while (recyclerView != null) {
                if (recyclerView != viewHolder.itemView) {
                    ViewParent parent = recyclerView.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    recyclerView = (View) parent;
                } else {
                    return;
                }
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    static RecyclerView g(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView g2 = g(viewGroup.getChildAt(i2));
            if (g2 != null) {
                return g2;
            }
        }
        return null;
    }

    public final ViewHolder f(int i2) {
        ViewHolder viewHolder = null;
        if (this.A) {
            return null;
        }
        int b2 = this.f3814h.b();
        for (int i3 = 0; i3 < b2; i3++) {
            ViewHolder c2 = c(this.f3814h.c(i3));
            if (c2 != null && !c2.isRemoved() && d(c2) == i2) {
                if (!this.f3814h.d(c2.itemView)) {
                    return c2;
                }
                viewHolder = c2;
            }
        }
        return viewHolder;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        i iVar = this.o;
        if (iVar != null) {
            return iVar.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    /* access modifiers changed from: package-private */
    public final void h(View view) {
        ViewHolder c2 = c(view);
        a aVar = this.n;
        if (!(aVar == null || c2 == null)) {
            aVar.onViewDetachedFromWindow(c2);
        }
        List<k> list = this.z;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.z.get(size).b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i2) {
        if (i2 != this.ak) {
            this.ak = i2;
            if (i2 != 2) {
                q();
            }
            i iVar = this.o;
            if (iVar != null) {
                iVar.j(i2);
            }
            n nVar = this.ay;
            if (nVar != null) {
                nVar.a(this, i2);
            }
            List<n> list = this.az;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.az.get(size).a(this, i2);
                }
            }
        }
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.x) {
            d_("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.x = false;
                if (!(!this.w || this.o == null || this.n == null)) {
                    requestLayout();
                }
                this.w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.x = true;
            this.aa = true;
            i();
        }
    }

    public final void d(int i2) {
        i iVar;
        if (!this.x && (iVar = this.o) != null) {
            iVar.a(this, this.G, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d_(String str) {
        if (l()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + a());
            }
            throw new IllegalStateException(str);
        } else if (this.ae > 0) {
            new IllegalStateException(a());
        }
    }

    /* access modifiers changed from: package-private */
    public final Rect f(View view) {
        j jVar = (j) view.getLayoutParams();
        if (!jVar.f3849e) {
            return jVar.f3848d;
        }
        if (this.G.f3882g && (jVar.f3847c.isUpdated() || jVar.f3847c.isInvalid())) {
            return jVar.f3848d;
        }
        Rect rect = jVar.f3848d;
        rect.set(0, 0, 0, 0);
        int size = this.r.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3818l.set(0, 0, 0, 0);
            this.r.get(i2).getItemOffsets(this.f3818l, view, this, this.G);
            rect.left += this.f3818l.left;
            rect.top += this.f3818l.top;
            rect.right += this.f3818l.right;
            rect.bottom += this.f3818l.bottom;
        }
        jVar.f3849e = false;
        return rect;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        i iVar = this.o;
        if (iVar != null) {
            return iVar.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + a());
    }

    public final void b(int i2) {
        if (!this.x) {
            i();
            i iVar = this.o;
            if (iVar != null) {
                iVar.e(i2);
                awakenScrollBars();
            }
        }
    }

    public final void c(h hVar) {
        boolean z2;
        i iVar = this.o;
        if (iVar != null) {
            iVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.r.remove(hVar);
        if (this.r.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            setWillNotDraw(z2);
        }
        J();
        requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r2 == 0.0f) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (r1 != 0.0f) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r4 = (int) (r1 * r14.av);
        r3 = (int) (r2 * r14.aw);
        r1 = r14.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r1 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r14.x != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r0 = r14.L;
        r0[0] = 0;
        r0[1] = 0;
        r6 = r1.f();
        r5 = r14.o.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r5 == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r0 = r6 | 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        h(r0, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r6 == 0) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r5 == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (a(r9, r10, r14.L, r14.aE, 1) == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        r1 = r14.L;
        r4 = r4 - r1[0];
        r3 = r3 - r1[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (r6 == 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r5 == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0088, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0089, code lost:
        a(r1, r0, r15, 1);
        r0 = r14.E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008e, code lost:
        if (r0 == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0090, code lost:
        if (r4 != 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0092, code lost:
        if (r3 == 0) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
        r0.a(r14, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0097, code lost:
        a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009b, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009d, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009f, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a3, code lost:
        r0 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public void setLayoutManager(i iVar) {
        if (iVar != this.o) {
            i();
            if (this.o != null) {
                f fVar = this.C;
                if (fVar != null) {
                    fVar.d();
                }
                this.o.c(this.f3811e);
                this.o.b(this.f3811e);
                this.f3811e.a();
                if (this.s) {
                    this.o.b(this, this.f3811e);
                }
                this.o.a((RecyclerView) null);
                this.o = null;
            } else {
                this.f3811e.a();
            }
            f fVar2 = this.f3814h;
            f.a aVar = fVar2.f4021b;
            while (true) {
                aVar.f4023a = 0;
                if (aVar.f4024b == null) {
                    break;
                }
                aVar = aVar.f4024b;
            }
            for (int size = fVar2.f4022c.size() - 1; size >= 0; size--) {
                fVar2.f4020a.d(fVar2.f4022c.get(size));
                fVar2.f4022c.remove(size);
            }
            fVar2.f4020a.b();
            this.o = iVar;
            if (iVar != null) {
                if (iVar.w == null) {
                    this.o.a(this);
                    if (this.s) {
                        this.o.b(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + iVar + " is already attached to a RecyclerView:" + iVar.w.a());
                }
            }
            this.f3811e.b();
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        this.B = z2 | this.B;
        this.A = true;
        M();
    }

    public void draw(Canvas canvas) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        super.draw(canvas);
        int size = this.r.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            this.r.get(i4).onDrawOver(canvas, this, this.G);
        }
        EdgeEffect edgeEffect = this.ag;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            if (this.f3816j) {
                i3 = getPaddingBottom();
            } else {
                i3 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i3), 0.0f);
            EdgeEffect edgeEffect2 = this.ag;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.ah;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3816j) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.ah;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z4 = false;
            } else {
                z4 = true;
            }
            z2 |= z4;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.ai;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f3816j) {
                i2 = getPaddingTop();
            } else {
                i2 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i2, (float) (-width));
            EdgeEffect edgeEffect6 = this.ai;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.aj;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3816j) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.aj;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z2 |= z5;
            canvas.restoreToCount(save4);
        }
        if (z2 || (this.C != null && this.r.size() > 0 && this.C.b())) {
            v.c(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (r4 != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d0, code lost:
        if (r6 != 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d2, code lost:
        setScrollState(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0156, code lost:
        if (r11 == false) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void b(m mVar) {
        this.U.remove(mVar);
        if (this.V == mVar) {
            this.V = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        int i2 = this.ad - 1;
        this.ad = i2;
        if (i2 <= 0) {
            this.ad = 0;
            if (z2) {
                z();
                N();
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a9n);
    }

    private boolean h(int i2, int i3) {
        return getScrollingChildHelper().a(i2, i3);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().a(f2, f3);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        d dVar = this.aB;
        if (dVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return dVar.a(i2, i3);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (l()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    private boolean g(int i2, int i3) {
        a(this.aC);
        int[] iArr = this.aC;
        if (iArr[0] == i2 && iArr[1] == i3) {
            return false;
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.o.q() && !l() && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public static void a(View view, Rect rect) {
        j jVar = (j) view.getLayoutParams();
        Rect rect2 = jVar.f3848d;
        rect.set((view.getLeft() - rect2.left) - jVar.leftMargin, (view.getTop() - rect2.top) - jVar.topMargin, view.getRight() + rect2.right + jVar.rightMargin, view.getBottom() + rect2.bottom + jVar.bottomMargin);
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z2) {
        ViewHolder c2 = c(view);
        if (c2 != null) {
            if (c2.isTmpDetached()) {
                c2.clearTmpDetachFlag();
            } else if (!c2.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + c2 + a());
            }
        }
        view.clearAnimation();
        h(view);
        super.removeDetachedView(view, z2);
    }

    public void scrollBy(int i2, int i3) {
        i iVar = this.o;
        if (iVar != null && !this.x) {
            boolean f2 = iVar.f();
            boolean g2 = this.o.g();
            if (f2 || g2) {
                if (!f2) {
                    i2 = 0;
                }
                if (!g2) {
                    i3 = 0;
                }
                a(i2, i3, (MotionEvent) null, 0);
            }
        }
    }

    private static Object a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!com.ss.android.ugc.aweme.lancet.i.f107219a) {
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
                        com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                    }
                }
                com.ss.android.ugc.aweme.lancet.i.f107219a = false;
            }
            return systemService;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.ag;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.ag.onRelease();
            z2 = this.ag.isFinished();
        }
        EdgeEffect edgeEffect2 = this.ai;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.ai.onRelease();
            z2 |= this.ai.isFinished();
        }
        EdgeEffect edgeEffect3 = this.ah;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.ah.onRelease();
            z2 |= this.ah.isFinished();
        }
        EdgeEffect edgeEffect4 = this.aj;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.aj.onRelease();
            z2 |= this.aj.isFinished();
        }
        if (z2) {
            v.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(int i2, int i3) {
        setMeasuredDimension(i.a(i2, getPaddingLeft() + getPaddingRight(), v.h(this)), i.a(i3, getPaddingTop() + getPaddingBottom(), v.i(this)));
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2, int i3) {
        if (i2 < 0) {
            s();
            if (this.ag.isFinished()) {
                this.ag.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            t();
            if (this.ai.isFinished()) {
                this.ai.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            u();
            if (this.ah.isFinished()) {
                this.ah.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            v();
            if (this.aj.isFinished()) {
                this.aj.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            v.c(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i2, int i3) {
        this.ae++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        n nVar = this.ay;
        if (nVar != null) {
            nVar.a(this, i2, i3);
        }
        List<n> list = this.az;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.az.get(size).a(this, i2, i3);
            }
        }
        this.ae--;
    }

    public void onMeasure(int i2, int i3) {
        i iVar = this.o;
        if (iVar == null) {
            e(i2, i3);
            return;
        }
        boolean z2 = false;
        if (iVar.w_()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.o.a(this.f3811e, this.G, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.aH = z2;
            if (!z2 && this.n != null) {
                if (this.G.f3879d == 1) {
                    G();
                }
                this.o.a_(i2, i3);
                this.G.f3884i = true;
                H();
                this.o.c(i2, i3);
                if (this.o.z_()) {
                    this.o.a_(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.G.f3884i = true;
                    H();
                    this.o.c(i2, i3);
                }
                this.aI = getMeasuredWidth();
                this.aJ = getMeasuredHeight();
            }
        } else if (this.t) {
            this.o.a(this.f3811e, this.G, i2, i3);
        } else {
            if (this.y) {
                h();
                j();
                B();
                b(true);
                if (this.G.f3886k) {
                    this.G.f3882g = true;
                } else {
                    this.f3813g.e();
                    this.G.f3882g = false;
                }
                this.y = false;
                a(false);
            } else if (this.G.f3886k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            a aVar = this.n;
            if (aVar != null) {
                this.G.f3880e = aVar.getItemCount();
            } else {
                this.G.f3880e = 0;
            }
            h();
            this.o.a(this.f3811e, this.G, i2, i3);
            a(false);
            this.G.f3882g = false;
        }
    }

    private void a(long j2, ViewHolder viewHolder) {
        int a2 = this.f3814h.a();
        for (int i2 = 0; i2 < a2; i2++) {
            ViewHolder c2 = c(this.f3814h.b(i2));
            if (c2 != viewHolder && e(c2) == j2) {
                a aVar = this.n;
                if (aVar == null || !aVar.mHasStableIds) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + c2 + " \n View Holder 2:" + viewHolder + a());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + c2 + " \n View Holder 2:" + viewHolder + a());
            }
        }
        a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0169, code lost:
        if (r11 > 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b3, code lost:
        if (r9 > 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01b7, code lost:
        if (r11 < 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01bb, code lost:
        if (r9 < 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01c4, code lost:
        if ((r9 * r10) <= 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01cd, code lost:
        if ((r9 * r10) >= 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r1 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006a, code lost:
        if (r1 != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (b(r13) != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0075, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0088, code lost:
        h();
        r12.o.a(r13, r14, r12.f3811e, r12.G);
        a(false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r13, int r14) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    private void a(View view, View view2) {
        View view3;
        boolean z2;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f3818l.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof j) {
            j jVar = (j) layoutParams;
            if (!jVar.f3849e) {
                Rect rect = jVar.f3848d;
                this.f3818l.left -= rect.left;
                this.f3818l.right += rect.right;
                this.f3818l.top -= rect.top;
                this.f3818l.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3818l);
            offsetRectIntoDescendantCoords(view, this.f3818l);
        }
        i iVar = this.o;
        Rect rect2 = this.f3818l;
        boolean z3 = !this.v;
        if (view2 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        iVar.a(this, view, rect2, z3, z2);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        super.addFocusables(arrayList, i2, i3);
    }

    public static abstract class h {
        static {
            Covode.recordClassIndex(1495);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void getItemOffsets(Rect rect, int i2, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, s sVar) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, s sVar) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            getItemOffsets(rect, ((j) view.getLayoutParams()).f3847c.getLayoutPosition(), recyclerView);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.o.a(this, view, rect, z2, false);
    }

    public static abstract class c {
        static {
            Covode.recordClassIndex(1487);
        }

        public void a() {
        }

        public void a(int i2, int i3) {
        }

        public void a(int i2, int i3, int i4) {
        }

        public void b() {
        }

        public void b(int i2, int i3) {
        }

        public void c(int i2, int i3) {
        }

        public void a(int i2, int i3, Object obj) {
            a(i2, i3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.f3814h.b();
        for (int i5 = 0; i5 < b2; i5++) {
            ViewHolder c2 = c(this.f3814h.c(i5));
            if (c2 != null && !c2.shouldIgnore()) {
                if (c2.mPosition >= i4) {
                    c2.offsetPosition(-i3, z2);
                    this.G.f3881f = true;
                } else if (c2.mPosition >= i2) {
                    c2.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.G.f3881f = true;
                }
            }
        }
        o oVar = this.f3811e;
        for (int size = oVar.f3853c.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = oVar.f3853c.get(size);
            if (viewHolder != null) {
                if (viewHolder.mPosition >= i4) {
                    viewHolder.offsetPosition(-i3, z2);
                } else if (viewHolder.mPosition >= i2) {
                    viewHolder.addFlags(8);
                    oVar.d(size);
                }
            }
        }
        requestLayout();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m.a aVar;
        float a2;
        float a3;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        char c2;
        boolean z4;
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        Object[] objArr;
        this.S = new q();
        this.f3811e = new o();
        this.f3815i = new af();
        this.f3817k = new Runnable() {
            /* class androidx.recyclerview.widget.RecyclerView.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1472);
            }

            public final void run() {
                if (RecyclerView.this.v && !RecyclerView.this.isLayoutRequested()) {
                    if (!RecyclerView.this.s) {
                        RecyclerView.this.requestLayout();
                    } else if (RecyclerView.this.x) {
                        RecyclerView.this.w = true;
                    } else {
                        RecyclerView.this.g();
                    }
                }
            }
        };
        this.f3818l = new Rect();
        this.T = new Rect();
        this.f3819m = new RectF();
        this.q = new ArrayList();
        this.r = new ArrayList<>();
        this.U = new ArrayList<>();
        this.W = 0;
        this.A = false;
        this.B = false;
        this.ad = 0;
        this.ae = 0;
        this.af = new e();
        this.C = new i();
        this.ak = 0;
        this.al = -1;
        this.av = Float.MIN_VALUE;
        this.aw = Float.MIN_VALUE;
        this.ax = true;
        this.D = new u();
        if (f3810d) {
            aVar = new m.a();
        } else {
            aVar = null;
        }
        this.F = aVar;
        this.G = new s();
        this.H = false;
        this.I = false;
        this.aA = new g();
        this.J = false;
        this.aC = new int[2];
        this.aE = new int[2];
        this.aF = new int[2];
        this.L = new int[2];
        this.M = new ArrayList();
        this.aG = new Runnable() {
            /* class androidx.recyclerview.widget.RecyclerView.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1473);
            }

            public final void run() {
                if (RecyclerView.this.C != null) {
                    RecyclerView.this.C.a();
                }
                RecyclerView.this.J = false;
            }
        };
        this.aI = 0;
        this.aJ = 0;
        this.aK = new af.b() {
            /* class androidx.recyclerview.widget.RecyclerView.AnonymousClass4 */

            static {
                Covode.recordClassIndex(1475);
            }

            @Override // androidx.recyclerview.widget.af.b
            public final void a(ViewHolder viewHolder) {
                RecyclerView.this.o.a(viewHolder.itemView, RecyclerView.this.f3811e);
            }

            @Override // androidx.recyclerview.widget.af.b
            public final void a(ViewHolder viewHolder, f.c cVar, f.c cVar2) {
                RecyclerView.this.f3811e.b(viewHolder);
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.a(viewHolder);
                viewHolder.setIsRecyclable(false);
                if (recyclerView.C.a(viewHolder, cVar, cVar2)) {
                    recyclerView.m();
                }
            }

            @Override // androidx.recyclerview.widget.af.b
            public final void b(ViewHolder viewHolder, f.c cVar, f.c cVar2) {
                RecyclerView recyclerView = RecyclerView.this;
                viewHolder.setIsRecyclable(false);
                if (recyclerView.C.b(viewHolder, cVar, cVar2)) {
                    recyclerView.m();
                }
            }

            @Override // androidx.recyclerview.widget.af.b
            public final void c(ViewHolder viewHolder, f.c cVar, f.c cVar2) {
                viewHolder.setIsRecyclable(false);
                if (RecyclerView.this.A) {
                    if (RecyclerView.this.C.a(viewHolder, viewHolder, cVar, cVar2)) {
                        RecyclerView.this.m();
                    }
                } else if (RecyclerView.this.C.c(viewHolder, cVar, cVar2)) {
                    RecyclerView.this.m();
                }
            }
        };
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ar = viewConfiguration.getScaledTouchSlop();
        if (Build.VERSION.SDK_INT >= 26) {
            a2 = viewConfiguration.getScaledHorizontalScrollFactor();
        } else {
            a2 = w.a(viewConfiguration, context);
        }
        this.av = a2;
        if (Build.VERSION.SDK_INT >= 26) {
            a3 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            a3 = w.a(viewConfiguration, context);
        }
        this.aw = a3;
        this.at = viewConfiguration.getScaledMinimumFlingVelocity();
        this.au = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        setWillNotDraw(z2);
        this.C.f3829h = this.aA;
        this.f3813g = new a(new a.AbstractC0057a() {
            /* class androidx.recyclerview.widget.RecyclerView.AnonymousClass6 */

            static {
                Covode.recordClassIndex(1477);
            }

            @Override // androidx.recyclerview.widget.a.AbstractC0057a
            public final void a(a.b bVar) {
                c(bVar);
            }

            @Override // androidx.recyclerview.widget.a.AbstractC0057a
            public final void b(a.b bVar) {
                c(bVar);
            }

            @Override // androidx.recyclerview.widget.a.AbstractC0057a
            public final ViewHolder a(int i2) {
                ViewHolder a2 = RecyclerView.this.a(i2, true);
                if (a2 != null && !RecyclerView.this.f3814h.d(a2.itemView)) {
                    return a2;
                }
                return null;
            }

            private void c(a.b bVar) {
                int i2 = bVar.f3949a;
                if (i2 == 1) {
                    RecyclerView.this.o.a(RecyclerView.this, bVar.f3950b, bVar.f3952d);
                } else if (i2 == 2) {
                    RecyclerView.this.o.b(RecyclerView.this, bVar.f3950b, bVar.f3952d);
                } else if (i2 == 4) {
                    RecyclerView.this.o.a(RecyclerView.this, bVar.f3950b, bVar.f3952d, bVar.f3951c);
                } else if (i2 == 8) {
                    RecyclerView.this.o.a(RecyclerView.this, bVar.f3950b, bVar.f3952d, 1);
                }
            }

            @Override // androidx.recyclerview.widget.a.AbstractC0057a
            public final void b(int i2, int i3) {
                RecyclerView.this.b(i2, i3, false);
                RecyclerView.this.H = true;
            }

            @Override // androidx.recyclerview.widget.a.AbstractC0057a
            public final void a(int i2, int i3) {
                RecyclerView.this.b(i2, i3, true);
                RecyclerView.this.H = true;
                RecyclerView.this.G.f3878c += i3;
            }

            @Override // androidx.recyclerview.widget.a.AbstractC0057a
            public final void d(int i2, int i3) {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                RecyclerView recyclerView = RecyclerView.this;
                int b2 = recyclerView.f3814h.b();
                int i9 = -1;
                if (i2 < i3) {
                    i5 = i2;
                    i4 = i3;
                    i6 = -1;
                } else {
                    i4 = i2;
                    i5 = i3;
                    i6 = 1;
                }
                for (int i10 = 0; i10 < b2; i10++) {
                    ViewHolder c2 = RecyclerView.c(recyclerView.f3814h.c(i10));
                    if (c2 != null && c2.mPosition >= i5 && c2.mPosition <= i4) {
                        if (c2.mPosition == i2) {
                            c2.offsetPosition(i3 - i2, false);
                        } else {
                            c2.offsetPosition(i6, false);
                        }
                        recyclerView.G.f3881f = true;
                    }
                }
                o oVar = recyclerView.f3811e;
                if (i2 < i3) {
                    i8 = i2;
                    i7 = i3;
                } else {
                    i7 = i2;
                    i8 = i3;
                    i9 = 1;
                }
                int size = oVar.f3853c.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ViewHolder viewHolder = oVar.f3853c.get(i11);
                    if (viewHolder != null && viewHolder.mPosition >= i8 && viewHolder.mPosition <= i7) {
                        if (viewHolder.mPosition == i2) {
                            viewHolder.offsetPosition(i3 - i2, false);
                        } else {
                            viewHolder.offsetPosition(i9, false);
                        }
                    }
                }
                recyclerView.requestLayout();
                RecyclerView.this.H = true;
            }

            @Override // androidx.recyclerview.widget.a.AbstractC0057a
            public final void c(int i2, int i3) {
                RecyclerView recyclerView = RecyclerView.this;
                int b2 = recyclerView.f3814h.b();
                for (int i4 = 0; i4 < b2; i4++) {
                    ViewHolder c2 = RecyclerView.c(recyclerView.f3814h.c(i4));
                    if (c2 != null && !c2.shouldIgnore() && c2.mPosition >= i2) {
                        c2.offsetPosition(i3, false);
                        recyclerView.G.f3881f = true;
                    }
                }
                o oVar = recyclerView.f3811e;
                int size = oVar.f3853c.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ViewHolder viewHolder = oVar.f3853c.get(i5);
                    if (viewHolder != null && viewHolder.mPosition >= i2) {
                        viewHolder.offsetPosition(i3, false);
                    }
                }
                recyclerView.requestLayout();
                RecyclerView.this.H = true;
            }

            @Override // androidx.recyclerview.widget.a.AbstractC0057a
            public final void a(int i2, int i3, Object obj) {
                int i4;
                RecyclerView recyclerView = RecyclerView.this;
                int b2 = recyclerView.f3814h.b();
                int i5 = i3 + i2;
                for (int i6 = 0; i6 < b2; i6++) {
                    View c2 = recyclerView.f3814h.c(i6);
                    ViewHolder c3 = RecyclerView.c(c2);
                    if (c3 != null && !c3.shouldIgnore() && c3.mPosition >= i2 && c3.mPosition < i5) {
                        c3.addFlags(2);
                        c3.addChangePayload(obj);
                        ((j) c2.getLayoutParams()).f3849e = true;
                    }
                }
                o oVar = recyclerView.f3811e;
                for (int size = oVar.f3853c.size() - 1; size >= 0; size--) {
                    ViewHolder viewHolder = oVar.f3853c.get(size);
                    if (viewHolder != null && (i4 = viewHolder.mPosition) >= i2 && i4 < i5) {
                        viewHolder.addFlags(2);
                        oVar.d(size);
                    }
                }
                RecyclerView.this.I = true;
            }
        });
        this.f3814h = new f(new f.b() {
            /* class androidx.recyclerview.widget.RecyclerView.AnonymousClass5 */

            static {
                Covode.recordClassIndex(1476);
            }

            @Override // androidx.recyclerview.widget.f.b
            public final int a() {
                return RecyclerView.this.getChildCount();
            }

            @Override // androidx.recyclerview.widget.f.b
            public final void b() {
                int childCount = RecyclerView.this.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View b2 = b(i2);
                    RecyclerView.this.h(b2);
                    b2.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }

            @Override // androidx.recyclerview.widget.f.b
            public final View b(int i2) {
                return RecyclerView.this.getChildAt(i2);
            }

            @Override // androidx.recyclerview.widget.f.b
            public final int a(View view) {
                return RecyclerView.this.indexOfChild(view);
            }

            @Override // androidx.recyclerview.widget.f.b
            public final ViewHolder b(View view) {
                return RecyclerView.c(view);
            }

            @Override // androidx.recyclerview.widget.f.b
            public final void c(View view) {
                ViewHolder c2 = RecyclerView.c(view);
                if (c2 != null) {
                    c2.onEnteredHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.f.b
            public final void d(View view) {
                ViewHolder c2 = RecyclerView.c(view);
                if (c2 != null) {
                    c2.onLeftHiddenState(RecyclerView.this);
                }
            }

            @Override // androidx.recyclerview.widget.f.b
            public final void a(int i2) {
                View childAt = RecyclerView.this.getChildAt(i2);
                if (childAt != null) {
                    RecyclerView.this.h(childAt);
                    childAt.clearAnimation();
                }
                RecyclerView.this.removeViewAt(i2);
            }

            @Override // androidx.recyclerview.widget.f.b
            public final void c(int i2) {
                ViewHolder c2;
                View b2 = b(i2);
                if (!(b2 == null || (c2 = RecyclerView.c(b2)) == null)) {
                    if (!c2.isTmpDetached() || c2.shouldIgnore()) {
                        c2.addFlags(256);
                    } else {
                        throw new IllegalArgumentException("called detach on an already detached child " + c2 + RecyclerView.this.a());
                    }
                }
                RecyclerView.this.detachViewFromParent((RecyclerView) i2);
            }

            @Override // androidx.recyclerview.widget.f.b
            public final void a(View view, int i2) {
                RecyclerView.this.addView(view, i2);
                RecyclerView recyclerView = RecyclerView.this;
                ViewHolder c2 = RecyclerView.c(view);
                if (!(recyclerView.n == null || c2 == null)) {
                    recyclerView.n.onViewAttachedToWindow(c2);
                }
                if (recyclerView.z != null) {
                    for (int size = recyclerView.z.size() - 1; size >= 0; size--) {
                        recyclerView.z.get(size).a(view);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.f.b
            public final void a(View view, int i2, ViewGroup.LayoutParams layoutParams) {
                ViewHolder c2 = RecyclerView.c(view);
                if (c2 != null) {
                    if (c2.isTmpDetached() || c2.shouldIgnore()) {
                        c2.clearTmpDetachFlag();
                    } else {
                        throw new IllegalArgumentException("Called attach on a child which is not detached: " + c2 + RecyclerView.this.a());
                    }
                }
                RecyclerView.this.attachViewToParent(view, i2, layoutParams);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            i3 = getImportantForAutofill();
        } else {
            i3 = 0;
        }
        if (i3 == 0 && Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(8);
        }
        if (v.d(this) == 0) {
            v.a((View) this, 1);
        }
        this.ac = (AccessibilityManager) a(getContext(), "accessibility");
        setAccessibilityDelegateCompat(new z(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842987, 16842993, R.attr.tw, R.attr.tx, R.attr.ty, R.attr.tz, R.attr.u0, R.attr.zb, R.attr.a9t, R.attr.acz, R.attr.aex}, i2, 0);
        v.a(this, context, new int[]{16842948, 16842987, 16842993, R.attr.tw, R.attr.tx, R.attr.ty, R.attr.tz, R.attr.u0, R.attr.zb, R.attr.a9t, R.attr.acz, R.attr.aex}, attributeSet, obtainStyledAttributes, i2);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3816j = obtainStyledAttributes.getBoolean(1, true);
        boolean z5 = obtainStyledAttributes.getBoolean(3, false);
        this.u = z5;
        if (z5) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + a());
            }
            Resources resources = getContext().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.jo);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.jq);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.jp);
            i4 = 4;
            c2 = 2;
            z3 = true;
            new l(this, stateListDrawable, drawable, stateListDrawable2, drawable2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelOffset);
        } else {
            i4 = 4;
            z3 = true;
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(trim, false, classLoader).asSubclass(i.class);
                    try {
                        constructor = asSubclass.getConstructor(R);
                        objArr = new Object[i4];
                        objArr[0] = context;
                        char c3 = z3 ? 1 : 0;
                        char c4 = z3 ? 1 : 0;
                        char c5 = z3 ? 1 : 0;
                        objArr[c3] = attributeSet;
                        objArr[c2] = Integer.valueOf(i2);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e3) {
                            e3.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e3);
                        }
                    }
                    constructor.setAccessible(z3);
                    setLayoutManager((i) constructor.newInstance(objArr));
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e8);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr = O;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
            v.a(this, context, iArr, attributeSet, obtainStyledAttributes2, i2);
            z4 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        } else {
            z4 = true;
        }
        setNestedScrollingEnabled(z4);
        addOnAttachStateChangeListener(new com.bytedance.analytics.a.f());
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            w();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(float r6, float r7, float r8, float r9) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.a(float, float, float, float):void");
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        androidx.core.d.g.a("RV OnLayout");
        C();
        androidx.core.d.g.a();
        this.v = true;
    }

    private void a(ViewHolder viewHolder, ViewHolder viewHolder2, f.c cVar, f.c cVar2, boolean z2, boolean z3) {
        viewHolder.setIsRecyclable(false);
        if (z2) {
            a(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z3) {
                a(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            a(viewHolder);
            this.f3811e.b(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.C.a(viewHolder, viewHolder2, cVar, cVar2)) {
            m();
        }
    }
}
