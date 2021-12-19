package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.c.h;
import androidx.core.app.a;
import androidx.core.app.d;
import androidx.core.app.p;
import androidx.lifecycle.af;
import androidx.lifecycle.ag;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class e extends d implements a.AbstractC0026a, a.c, ag {
    boolean mCreated;
    final g mFragments = new g(new a());
    final Handler mHandler = new Handler() {
        /* class androidx.fragment.app.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(1039);
        }

        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            e.this.onResumeFragments();
            e.this.mFragments.b();
        }
    };
    int mNextCandidateRequestIndex;
    h<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;
    private af mViewModelStore;

    static {
        Covode.recordClassIndex(1038);
    }

    public static int androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    class a extends h<e> {
        static {
            Covode.recordClassIndex(1040);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.fragment.app.h
        public final /* bridge */ /* synthetic */ e g() {
            return e.this;
        }

        @Override // androidx.fragment.app.h
        public final void d() {
            e.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.h
        public final boolean b() {
            if (!e.this.isFinishing()) {
                return true;
            }
            return false;
        }

        @Override // androidx.fragment.app.h
        public final LayoutInflater c() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.fragment.app.h
        public final boolean e() {
            if (e.this.getWindow() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.fragment.app.h
        public final int f() {
            Window window = e.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.f
        public final boolean a() {
            Window window = e.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public a() {
            super(e.this);
        }

        @Override // androidx.fragment.app.h, androidx.fragment.app.f
        public final View a(int i2) {
            return e.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.h
        public final void a(Fragment fragment) {
            e.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.h
        public final boolean a(String str) {
            return androidx.core.app.a.a((Activity) e.this, str);
        }

        @Override // androidx.fragment.app.h
        public final void a(Fragment fragment, String[] strArr, int i2) {
            e.this.requestPermissionsFromFragment(fragment, strArr, i2);
        }

        @Override // androidx.fragment.app.h
        public final void a(String str, PrintWriter printWriter, String[] strArr) {
            e.this.dump(str, null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        public final void a(Fragment fragment, Intent intent, int i2, Bundle bundle) {
            e.this.startActivityFromFragment(fragment, intent, i2, bundle);
        }

        @Override // androidx.fragment.app.h
        public final void a(Fragment fragment, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
            e.this.startIntentSenderFromFragment(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        Object f2924a;

        /* renamed from: b  reason: collision with root package name */
        af f2925b;

        /* renamed from: c  reason: collision with root package name */
        k f2926c;

        static {
            Covode.recordClassIndex(1041);
        }

        b() {
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.a.a((Activity) this);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.a.b((Activity) this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.a.c(this);
    }

    @Override // androidx.core.app.d, androidx.lifecycle.m
    public i getLifecycle() {
        return super.getLifecycle();
    }

    public i getSupportFragmentManager() {
        return this.mFragments.f2927a.f2932e;
    }

    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.a(this);
    }

    public void onStateNotSaved() {
        this.mFragments.a();
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), i.b.CREATED));
    }

    public Object getLastCustomNonConfigurationInstance() {
        b bVar = (b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f2924a;
        }
        return null;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.f2927a.f2932e.s();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragments.f2927a.f2932e.p();
    }

    public void onBackPressed() {
        j jVar = this.mFragments.f2927a.f2932e;
        if (jVar.h()) {
            if (Build.VERSION.SDK_INT <= 25) {
                return;
            }
        } else if (jVar.d()) {
            return;
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mViewModelStore != null && !isChangingConfigurations()) {
            this.mViewModelStore.a();
        }
        this.mFragments.f2927a.f2932e.r();
    }

    public void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.b();
    }

    public void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.b();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.f2927a.f2932e.q();
    }

    @Override // androidx.lifecycle.ag
    public af getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.mViewModelStore = bVar.f2925b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new af();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        if (this.mHandler.hasMessages(2)) {
            this.mHandler.removeMessages(2);
            onResumeFragments();
        }
        this.mFragments.f2927a.f2932e.d(3);
    }

    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        j jVar = this.mFragments.f2927a.f2932e;
        j.a(jVar.D);
        k kVar = jVar.D;
        if (kVar == null && this.mViewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        b bVar = new b();
        bVar.f2924a = onRetainCustomNonConfigurationInstance;
        bVar.f2925b = this.mViewModelStore;
        bVar.f2926c = kVar;
        return bVar;
    }

    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.f2927a.f2932e.n();
        }
        this.mFragments.a();
        this.mFragments.b();
        this.mFragments.f2927a.f2932e.o();
    }

    static void checkForValidRequestCode(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.f2927a.f2932e.a(z);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.a();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.f2927a.f2932e.b(z);
    }

    @Override // androidx.core.app.a.c
    public final void validateRequestPermissionsRequestCode(int i2) {
        if (!this.mRequestedPermissionsFromFragment && i2 != -1) {
            checkForValidRequestCode(i2);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.a();
        this.mFragments.f2927a.f2932e.a(configuration);
    }

    public void setEnterSharedElementCallback(p pVar) {
        a.d dVar;
        if (Build.VERSION.SDK_INT >= 21) {
            if (pVar != null) {
                dVar = new a.d(pVar);
            } else {
                dVar = null;
            }
            setEnterSharedElementCallback(dVar);
        }
    }

    public void setExitSharedElementCallback(p pVar) {
        a.d dVar;
        if (Build.VERSION.SDK_INT >= 21) {
            if (pVar != null) {
                dVar = new a.d(pVar);
            } else {
                dVar = null;
            }
            setExitSharedElementCallback(dVar);
        }
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.b() < 65534) {
            while (this.mPendingFragmentActivityResults.e(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            }
            int i2 = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.b(i2, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            return i2;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    @Override // androidx.core.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        Parcelable k2 = this.mFragments.f2927a.f2932e.k();
        if (k2 != null) {
            bundle.putParcelable("android:support:fragments", k2);
        }
        if (this.mPendingFragmentActivityResults.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.b()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.b()];
            for (int i2 = 0; i2 < this.mPendingFragmentActivityResults.b(); i2++) {
                iArr[i2] = this.mPendingFragmentActivityResults.c(i2);
                strArr[i2] = this.mPendingFragmentActivityResults.d(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // androidx.core.app.d
    public void onCreate(Bundle bundle) {
        g gVar = this.mFragments;
        j jVar = gVar.f2927a.f2932e;
        h<?> hVar = gVar.f2927a;
        h<?> hVar2 = gVar.f2927a;
        k kVar = null;
        jVar.a(hVar, hVar2, (Fragment) null);
        super.onCreate(bundle);
        b bVar = (b) getLastNonConfigurationInstance();
        if (!(bVar == null || bVar.f2925b == null || this.mViewModelStore != null)) {
            this.mViewModelStore = bVar.f2925b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            g gVar2 = this.mFragments;
            if (bVar != null) {
                kVar = bVar.f2926c;
            }
            gVar2.f2927a.f2932e.a(parcelable, kVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new h<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.mPendingFragmentActivityResults.b(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new h<>();
            this.mNextCandidateRequestIndex = 0;
        }
        this.mFragments.f2927a.f2932e.m();
    }

    /* access modifiers changed from: protected */
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.mFragments.f2927a.f2932e.b(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (!this.mStartedActivityFromFragment && i2 != -1) {
            checkForValidRequestCode(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        g gVar = this.mFragments;
        return onCreatePanelMenu | gVar.f2927a.f2932e.a(menu, getMenuInflater());
    }

    private static boolean markState(i iVar, i.b bVar) {
        boolean z = false;
        for (Fragment fragment : iVar.f()) {
            if (fragment != null) {
                if (fragment.getLifecycle().a().isAtLeast(i.b.STARTED)) {
                    fragment.mLifecycleRegistry.a(bVar);
                    z = true;
                }
                i peekChildFragmentManager = fragment.peekChildFragmentManager();
                if (peekChildFragmentManager != null) {
                    z |= markState(peekChildFragmentManager, bVar);
                }
            }
        }
        return z;
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.mFragments.f2927a.f2932e.a(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.mFragments.f2927a.f2932e.b(menuItem);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i2) {
        startActivityFromFragment(fragment, intent, i2, null);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0 || menu == null) {
            return super.onPreparePanel(i2, view, menu);
        }
        return onPrepareOptionsPanel(view, menu) | this.mFragments.f2927a.f2932e.a(menu);
    }

    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i2 != -1) {
            checkForValidRequestCode(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i2) {
        if (i2 == -1) {
            androidx.core.app.a.a(this, strArr, i2);
            return;
        }
        checkForValidRequestCode(i2);
        try {
            this.mRequestedPermissionsFromFragment = true;
            androidx.core.app.a.a(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i2 & 65535));
            this.mRequestedPermissionsFromFragment = false;
        } catch (Throwable th) {
            this.mRequestedPermissionsFromFragment = false;
            throw th;
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.mFragments.a();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String a2 = this.mPendingFragmentActivityResults.a(i5, null);
            this.mPendingFragmentActivityResults.b(i5);
            if (a2 == null) {
                androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a3 = this.mFragments.a(a2);
            if (a3 == null) {
                androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w("FragmentActivity", "Activity result no fragment exists for who: ".concat(String.valueOf(a2)));
            } else {
                a3.onActivityResult(i2 & 65535, i3, intent);
            }
        } else {
            a.b bVar = androidx.core.app.a.f2126a;
            if (bVar == null || !bVar.b()) {
                super.onActivityResult(i2, i3, intent);
            }
        }
    }

    @Override // androidx.core.app.a.AbstractC0026a
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.mFragments.a();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a2 = this.mPendingFragmentActivityResults.a(i4, null);
            this.mPendingFragmentActivityResults.b(i4);
            if (a2 == null) {
                androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a3 = this.mFragments.a(a2);
            if (a3 == null) {
                androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w("FragmentActivity", "Activity result no fragment exists for who: ".concat(String.valueOf(a2)));
            } else {
                a3.onRequestPermissionsResult(i2 & 65535, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f2927a.f2932e.onCreateView(view, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i2, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i2 == -1) {
            try {
                androidx.core.app.a.a(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i2);
            androidx.core.app.a.a(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i2 & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.a.a(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.f2927a.f2932e.a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (!this.mStartedIntentSenderFromFragment && i2 != -1) {
            checkForValidRequestCode(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (!this.mStartedIntentSenderFromFragment && i2 != -1) {
            checkForValidRequestCode(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        this.mStartedIntentSenderFromFragment = true;
        if (i2 == -1) {
            try {
                androidx.core.app.a.a(this, intentSender, i2, intent, i3, i4, i5, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i2);
            androidx.core.app.a.a(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i2 & 65535), intent, i3, i4, i5, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }
}
