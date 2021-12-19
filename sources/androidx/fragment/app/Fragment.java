package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.c.g;
import androidx.core.app.p;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, ag, m {
    static final Object USE_DEFAULT_TRANSITION = new Object();
    private static final g<String, Class<?>> sClassMap = new g<>();
    boolean mAdded;
    a mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    j mChildFragmentManager;
    k mChildNonConfig;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    j mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    h mHost;
    boolean mInLayout;
    int mIndex = -1;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    n mLifecycleRegistry = new n(this);
    boolean mMenuVisible = true;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    Boolean mSavedUserVisibleHint;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetIndex = -1;
    int mTargetRequestCode;
    boolean mUserVisibleHint = true;
    View mView;
    m mViewLifecycleOwner;
    t<m> mViewLifecycleOwnerLiveData = new t<>();
    n mViewLifecycleRegistry;
    af mViewModelStore;
    String mWho;

    /* access modifiers changed from: package-private */
    public interface c {
        static {
            Covode.recordClassIndex(1027);
        }

        void a();

        void b();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final i getFragmentManager() {
        return this.mFragmentManager;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Override // androidx.lifecycle.m
    public i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public final String getTag() {
        return this.mTag;
    }

    public final Fragment getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LiveData<m> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    /* access modifiers changed from: package-private */
    public i peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.a(this);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.l();
        }
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().q = true;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.fragment.app.Fragment.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1024);
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
        final Bundle f2871a;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(1023);
        }

        SavedState(Bundle bundle) {
            this.f2871a = bundle;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeBundle(this.f2871a);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2871a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        View f2872a;

        /* renamed from: b  reason: collision with root package name */
        Animator f2873b;

        /* renamed from: c  reason: collision with root package name */
        int f2874c;

        /* renamed from: d  reason: collision with root package name */
        int f2875d;

        /* renamed from: e  reason: collision with root package name */
        int f2876e;

        /* renamed from: f  reason: collision with root package name */
        int f2877f;

        /* renamed from: g  reason: collision with root package name */
        Object f2878g;

        /* renamed from: h  reason: collision with root package name */
        Object f2879h = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: i  reason: collision with root package name */
        Object f2880i;

        /* renamed from: j  reason: collision with root package name */
        Object f2881j = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: k  reason: collision with root package name */
        Object f2882k;

        /* renamed from: l  reason: collision with root package name */
        Object f2883l = Fragment.USE_DEFAULT_TRANSITION;

        /* renamed from: m  reason: collision with root package name */
        Boolean f2884m;
        Boolean n;
        p o;
        p p;
        boolean q;
        c r;
        boolean s;

        static {
            Covode.recordClassIndex(1025);
        }

        a() {
        }
    }

    private a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new a();
        }
        return this.mAnimationInfo;
    }

    public final e getActivity() {
        h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return (e) hVar.f2929b;
    }

    /* access modifiers changed from: package-private */
    public View getAnimatingAway() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f2872a;
    }

    /* access modifiers changed from: package-private */
    public Animator getAnimator() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f2873b;
    }

    public Context getContext() {
        h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.f2930c;
    }

    public Object getEnterTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f2878g;
    }

    /* access modifiers changed from: package-private */
    public p getEnterTransitionCallback() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.o;
    }

    public Object getExitTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f2880i;
    }

    /* access modifiers changed from: package-private */
    public p getExitTransitionCallback() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.p;
    }

    public final Object getHost() {
        h hVar = this.mHost;
        if (hVar == null) {
            return null;
        }
        return hVar.g();
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        if (layoutInflater == null) {
            return performGetLayoutInflater(null);
        }
        return layoutInflater;
    }

    /* access modifiers changed from: package-private */
    public int getNextAnim() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f2875d;
    }

    /* access modifiers changed from: package-private */
    public int getNextTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f2876e;
    }

    /* access modifiers changed from: package-private */
    public int getNextTransitionStyle() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f2877f;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public Object getSharedElementEnterTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        return aVar.f2882k;
    }

    /* access modifiers changed from: package-private */
    public int getStateAfterAnimating() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return 0;
        }
        return aVar.f2874c;
    }

    public m getViewLifecycleOwner() {
        m mVar = this.mViewLifecycleOwner;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final boolean isAdded() {
        if (this.mHost == null || !this.mAdded) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isHideReplaced() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return false;
        }
        return aVar.s;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return false;
        }
        return aVar.q;
    }

    public final boolean isResumed() {
        if (this.mState >= 4) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        j jVar = this.mFragmentManager;
        if (jVar == null) {
            return false;
        }
        return jVar.h();
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.s();
        }
    }

    static {
        Covode.recordClassIndex(1019);
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener() {
        a aVar = this.mAnimationInfo;
        if (aVar != null) {
            aVar.q = false;
            c cVar = this.mAnimationInfo.r;
            this.mAnimationInfo.r = null;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    public boolean getAllowEnterTransitionOverlap() {
        a aVar = this.mAnimationInfo;
        if (aVar == null || aVar.n == null) {
            return true;
        }
        return this.mAnimationInfo.n.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        a aVar = this.mAnimationInfo;
        if (aVar == null || aVar.f2884m == null) {
            return true;
        }
        return this.mAnimationInfo.f2884m.booleanValue();
    }

    public Object getReenterTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        if (aVar.f2881j == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return this.mAnimationInfo.f2881j;
    }

    public Object getReturnTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        if (aVar.f2879h == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return this.mAnimationInfo.f2879h;
    }

    public Object getSharedElementReturnTransition() {
        a aVar = this.mAnimationInfo;
        if (aVar == null) {
            return null;
        }
        if (aVar.f2883l == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.f2883l;
    }

    @Override // androidx.lifecycle.ag
    public af getViewModelStore() {
        if (getContext() != null) {
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new af();
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    public void instantiateChildFragmentManager() {
        if (this.mHost != null) {
            j jVar = new j();
            this.mChildFragmentManager = jVar;
            jVar.a(this.mHost, new f() {
                /* class androidx.fragment.app.Fragment.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(1021);
                }

                @Override // androidx.fragment.app.f
                public final boolean a() {
                    if (Fragment.this.mView != null) {
                        return true;
                    }
                    return false;
                }

                @Override // androidx.fragment.app.f
                public final View a(int i2) {
                    if (Fragment.this.mView != null) {
                        return Fragment.this.mView.findViewById(i2);
                    }
                    throw new IllegalStateException("Fragment does not have a view");
                }

                @Override // androidx.fragment.app.f
                public final Fragment a(Context context, String str, Bundle bundle) {
                    return Fragment.this.mHost.a(context, str, bundle);
                }
            }, this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public void onDestroy() {
        boolean z = true;
        this.mCalled = true;
        e activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            z = false;
        }
        af afVar = this.mViewModelStore;
        if (afVar != null && !z) {
            afVar.a();
        }
    }

    public final i getChildFragmentManager() {
        if (this.mChildFragmentManager == null) {
            instantiateChildFragmentManager();
            int i2 = this.mState;
            if (i2 >= 4) {
                this.mChildFragmentManager.p();
            } else if (i2 >= 3) {
                this.mChildFragmentManager.o();
            } else if (i2 >= 2) {
                this.mChildFragmentManager.n();
            } else if (i2 > 0) {
                this.mChildFragmentManager.m();
            }
        }
        return this.mChildFragmentManager;
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    public final boolean isVisible() {
        View view;
        if (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mLifecycleRegistry.a(i.a.ON_DESTROY);
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.r();
        }
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public final e requireActivity() {
        e activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final i requireFragmentManager() {
        i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public void startPostponedEnterTransition() {
        j jVar = this.mFragmentManager;
        if (jVar == null || jVar.f2945m == null) {
            ensureAnimationInfo().q = false;
        } else if (Looper.myLooper() != this.mFragmentManager.f2945m.f2931d.getLooper()) {
            this.mFragmentManager.f2945m.f2931d.postAtFrontOfQueue(new Runnable() {
                /* class androidx.fragment.app.Fragment.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1020);
                }

                public final void run() {
                    Fragment.this.callStartTransitionListener();
                }
            });
        } else {
            callStartTransitionListener();
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.a(i.a.ON_DESTROY);
        }
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.d(1);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.a(this).a();
            this.mPerformedCreateView = false;
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void performDetach() {
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            j jVar = this.mChildFragmentManager;
            if (jVar == null) {
                return;
            }
            if (this.mRetaining) {
                jVar.r();
                this.mChildFragmentManager = null;
                return;
            }
            throw new IllegalStateException("Child FragmentManager of " + this + " was not  destroyed and this fragment is not retaining instance");
        }
        throw new s("Fragment " + this + " did not call through to super.onDetach()");
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.a(i.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.a(i.a.ON_PAUSE);
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.d(3);
        }
        this.mState = 3;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new s("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.l();
            this.mChildFragmentManager.j();
        }
        this.mState = 4;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            j jVar2 = this.mChildFragmentManager;
            if (jVar2 != null) {
                jVar2.p();
                this.mChildFragmentManager.j();
            }
            this.mLifecycleRegistry.a(i.a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.a(i.a.ON_RESUME);
                return;
            }
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.l();
            this.mChildFragmentManager.j();
        }
        this.mState = 3;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            j jVar2 = this.mChildFragmentManager;
            if (jVar2 != null) {
                jVar2.o();
            }
            this.mLifecycleRegistry.a(i.a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleRegistry.a(i.a.ON_START);
                return;
            }
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        if (this.mView != null) {
            this.mViewLifecycleRegistry.a(i.a.ON_STOP);
        }
        this.mLifecycleRegistry.a(i.a.ON_STOP);
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.q();
        }
        this.mState = 2;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new s("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        androidx.core.g.b.a(this, sb);
        if (this.mIndex >= 0) {
            sb.append(" #");
            sb.append(this.mIndex);
        }
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f2872a = view;
    }

    /* access modifiers changed from: package-private */
    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f2873b = animator;
    }

    public void setEnterSharedElementCallback(p pVar) {
        ensureAnimationInfo().o = pVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f2878g = obj;
    }

    public void setExitSharedElementCallback(p pVar) {
        ensureAnimationInfo().p = pVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f2880i = obj;
    }

    /* access modifiers changed from: package-private */
    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().s = z;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f2881j = obj;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f2879h = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f2882k = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f2883l = obj;
    }

    /* access modifiers changed from: package-private */
    public void setStateAfterAnimating(int i2) {
        ensureAnimationInfo().f2874c = i2;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.a(configuration);
        }
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.a(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.b(z);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().n = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f2884m = Boolean.valueOf(z);
    }

    /* access modifiers changed from: package-private */
    public void setNextAnim(int i2) {
        if (this.mAnimationInfo != null || i2 != 0) {
            ensureAnimationInfo().f2875d = i2;
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        h hVar = this.mHost;
        if (hVar != null) {
            return hVar.a(str);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            return jVar.b(str);
        }
        return null;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        h hVar = this.mHost;
        if (hVar != null) {
            LayoutInflater c2 = hVar.c();
            getChildFragmentManager();
            androidx.core.h.g.a(c2, this.mChildFragmentManager);
            return c2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        h hVar = this.mHost;
        if (hVar != null && (activity = hVar.f2929b) != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        j jVar = this.mChildFragmentManager;
        if (jVar != null && jVar.f2944l <= 0) {
            this.mChildFragmentManager.m();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        j jVar = this.mChildFragmentManager;
        if (jVar == null || !jVar.b(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            j jVar = this.mChildFragmentManager;
            if (jVar != null) {
                jVar.b(menu);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            return z | jVar.a(menu);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle bundle) {
        Parcelable k2;
        onSaveInstanceState(bundle);
        j jVar = this.mChildFragmentManager;
        if (jVar != null && (k2 = jVar.k()) != null) {
            bundle.putParcelable("android:support:fragments", k2);
        }
    }

    public void setArguments(Bundle bundle) {
        if (this.mIndex < 0 || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active and state has been saved");
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.d();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mIndex < 0) {
            if (savedState == null || savedState.f2871a == null) {
                bundle = null;
            } else {
                bundle = savedState.f2871a;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already active");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle bundle) {
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.l();
        }
        this.mState = 2;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            j jVar2 = this.mChildFragmentManager;
            if (jVar2 != null) {
                jVar2.n();
                return;
            }
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle bundle) {
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.l();
        }
        this.mState = 1;
        this.mCalled = false;
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.a(i.a.ON_CREATE);
            return;
        }
        throw new s("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        j jVar = this.mChildFragmentManager;
        if (jVar == null || !jVar.a(menuItem)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.mChildFragmentManager == null) {
                instantiateChildFragmentManager();
            }
            this.mChildFragmentManager.a(parcelable, this.mChildNonConfig);
            this.mChildNonConfig = null;
            this.mChildFragmentManager.m();
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mInnerView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new s("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleRegistry.a(i.a.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnStartEnterTransitionListener(c cVar) {
        ensureAnimationInfo();
        if (cVar != this.mAnimationInfo.r) {
            if (cVar == null || this.mAnimationInfo.r == null) {
                if (this.mAnimationInfo.q) {
                    this.mAnimationInfo.r = cVar;
                }
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on ".concat(String.valueOf(this)));
        }
    }

    public void setUserVisibleHint(boolean z) {
        boolean z2;
        if (!this.mUserVisibleHint && z && this.mState < 3 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.b(this);
        }
        this.mUserVisibleHint = z;
        if (this.mState >= 3 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public static class b extends RuntimeException {
        static {
            Covode.recordClassIndex(1026);
        }

        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public void startActivityForResult(Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    static boolean isSupportFragmentClass(Context context, String str) {
        try {
            g<String, Class<?>> gVar = sClassMap;
            Class<?> cls = gVar.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                gVar.put(str, cls);
            }
            return Fragment.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            return z | jVar.a(menu, menuInflater);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void setNextTransition(int i2, int i3) {
        if (this.mAnimationInfo != null || i2 != 0 || i3 != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f2876e = i2;
            this.mAnimationInfo.f2877f = i3;
        }
    }

    public final void requestPermissions(String[] strArr, int i2) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.a(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public final void setIndex(int i2, Fragment fragment) {
        this.mIndex = i2;
        if (fragment != null) {
            this.mWho = fragment.mWho + ":" + this.mIndex;
        } else {
            this.mWho = "android:fragment:" + this.mIndex;
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.a(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void setTargetFragment(Fragment fragment, int i2) {
        i iVar;
        i fragmentManager = getFragmentManager();
        if (fragment != null) {
            iVar = fragment.getFragmentManager();
        } else {
            iVar = null;
        }
        if (fragmentManager == null || iVar == null || fragmentManager == iVar) {
            for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
                if (fragment2 == this) {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            this.mTarget = fragment;
            this.mTargetRequestCode = i2;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        getActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        h hVar = this.mHost;
        if (hVar != null && (activity = hVar.f2929b) != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j jVar = this.mChildFragmentManager;
        if (jVar != null) {
            jVar.l();
        }
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new m() {
            /* class androidx.fragment.app.Fragment.AnonymousClass3 */

            static {
                Covode.recordClassIndex(1022);
            }

            @Override // androidx.lifecycle.m
            public final i getLifecycle() {
                if (Fragment.this.mViewLifecycleRegistry == null) {
                    Fragment.this.mViewLifecycleRegistry = new n(Fragment.this.mViewLifecycleOwner);
                }
                return Fragment.this.mViewLifecycleRegistry;
            }
        };
        this.mViewLifecycleRegistry = null;
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.getLifecycle();
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (this.mViewLifecycleRegistry == null) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.a(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            g<String, Class<?>> gVar = sClassMap;
            Class<?> cls = gVar.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                gVar.put(str, cls);
            }
            Fragment fragment = (Fragment) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (ClassNotFoundException e2) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new b("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new b("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new b("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mIndex=");
        printWriter.print(this.mIndex);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mRetaining=");
        printWriter.print(this.mRetaining);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mTarget != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(this.mTarget);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (getNextAnim() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(str);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(getStateAfterAnimating());
        }
        if (getContext() != null) {
            androidx.loader.app.a.a(this).a(str, fileDescriptor, printWriter, strArr);
        }
        if (this.mChildFragmentManager != null) {
            printWriter.print(str);
            printWriter.println("Child " + this.mChildFragmentManager + ":");
            this.mChildFragmentManager.a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        h hVar = this.mHost;
        if (hVar != null) {
            hVar.a(this, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
}
