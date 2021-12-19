package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.aq;
import androidx.core.app.g;
import androidx.core.app.q;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.TiktokSkinHelper;

public class d extends e implements e, q.a {
    private f mDelegate;
    private Resources mResources;
    private int mThemeId;

    static {
        Covode.recordClassIndex(252);
    }

    public void AppCompatActivity__recreate$___twin___() {
        super.recreate();
    }

    public Resources getResources() {
        return androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources(this);
    }

    public void onPrepareSupportNavigateUpTaskStack(q qVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeFinished(b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void onSupportActionModeStarted(b bVar) {
    }

    public void onSupportContentChanged() {
    }

    @Override // androidx.appcompat.app.e
    public b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    public void recreate() {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_recreate(this);
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_net_lancet_ViewInflateLancet_setContentView(this, i2);
    }

    public void setSupportProgress(int i2) {
    }

    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // androidx.core.app.q.a
    public Intent getSupportParentActivityIntent() {
        return g.a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().g();
    }

    @Override // androidx.fragment.app.e
    public void supportInvalidateOptionsMenu() {
        getDelegate().g();
    }

    public b.a getDrawerToggleDelegate() {
        return getDelegate().i();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().b();
    }

    public a getSupportActionBar() {
        return getDelegate().a();
    }

    @Override // androidx.fragment.app.e
    public void onDestroy() {
        super.onDestroy();
        getDelegate().h();
    }

    @Override // androidx.fragment.app.e
    public void onPostResume() {
        super.onPostResume();
        getDelegate().f();
    }

    @Override // androidx.fragment.app.e
    public void onStart() {
        super.onStart();
        getDelegate().d();
    }

    @Override // androidx.fragment.app.e
    public void onStop() {
        super.onStop();
        getDelegate().e();
    }

    public Resources AppCompatActivity__getResources$___twin___() {
        if (this.mResources == null && aq.a()) {
            this.mResources = new aq(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public void closeOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.g()) {
            super.closeOptionsMenu();
        }
    }

    public f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = new g(this, getWindow(), this);
        }
        return this.mDelegate;
    }

    public void openOptionsMenu() {
        a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.f()) {
            super.openOptionsMenu();
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            q qVar = new q(this);
            onCreateSupportNavigateUpTaskStack(qVar);
            onPrepareSupportNavigateUpTaskStack(qVar);
            if (!qVar.f2265a.isEmpty()) {
                Intent[] intentArr = (Intent[]) qVar.f2265a.toArray(new Intent[qVar.f2265a.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                androidx.core.content.b.a(qVar.f2266b, intentArr, (Bundle) null);
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    public static Resources androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources(d dVar) {
        Resources AppCompatActivity__getResources$___twin___ = dVar.AppCompatActivity__getResources$___twin___();
        TiktokSkinHelper.a(AppCompatActivity__getResources$___twin___);
        return AppCompatActivity__getResources$___twin___;
    }

    public void AppCompatActivity__setContentView$___twin___(int i2) {
        getDelegate().b(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        getDelegate().a(view);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().a(toolbar);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i2) {
        super.setTheme(i2);
        this.mThemeId = i2;
    }

    public void supportNavigateUpTo(Intent intent) {
        int i2 = Build.VERSION.SDK_INT;
        navigateUpTo(intent);
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_recreate(d dVar) {
        dVar.AppCompatActivity__recreate$___twin___();
        try {
            throw new RuntimeException("Activity recreated!");
        } catch (Exception e2) {
            com.bytedance.c.a.a.a.b.a(e2);
        }
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) getDelegate().a(i2);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().c();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().b(bundle);
    }

    public androidx.appcompat.view.b startSupportActionMode(b.a aVar) {
        return getDelegate().a(aVar);
    }

    public boolean supportRequestWindowFeature(int i2) {
        return getDelegate().c(i2);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        int i2 = Build.VERSION.SDK_INT;
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.core.app.d
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.e
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().a(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        f delegate = getDelegate();
        delegate.j();
        delegate.a(bundle);
        if (delegate.k() && this.mThemeId != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.mThemeId, false);
            } else {
                setTheme(this.mThemeId);
            }
        }
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(q qVar) {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null || (supportParentActivityIntent = g.a(this)) != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(qVar.f2266b.getPackageManager());
            }
            qVar.a(component);
            qVar.f2265a.add(supportParentActivityIntent);
        }
    }

    @Override // androidx.fragment.app.e
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().b(view, layoutParams);
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i2, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        getDelegate().a(charSequence);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().a(view, layoutParams);
    }

    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_net_lancet_ViewInflateLancet_setContentView(d dVar, int i2) {
        if (!com.ss.android.ugc.aweme.net.e.b.a()) {
            dVar.AppCompatActivity__setContentView$___twin___(i2);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dVar.AppCompatActivity__setContentView$___twin___(i2);
        com.ss.android.ugc.aweme.net.e.b.a("set", i2, SystemClock.elapsedRealtime() - elapsedRealtime, dVar);
    }

    private boolean performMenuItemShortcut(int i2, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.e
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.b() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }
}
