package com.kakao.usermgmt;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.kakao.auth.AuthType;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoginButton extends FrameLayout {
    private Fragment supportFragment;

    static {
        Covode.recordClassIndex(34409);
    }

    public Fragment getSupportFragment() {
        return this.supportFragment;
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        inflate(getContext(), R.layout.ae4, this);
        setOnClickListener(new View.OnClickListener() {
            /* class com.kakao.usermgmt.LoginButton.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34410);
            }

            public void onClick(View view) {
                LoginButton.this.onClickLoginButton(LoginButton.this.getAuthTypes());
            }
        });
    }

    /* access modifiers changed from: protected */
    public List<AuthType> getAuthTypes() {
        ArrayList arrayList = new ArrayList();
        if (Session.getCurrentSession().getAuthCodeManager().isTalkLoginAvailable()) {
            arrayList.add(AuthType.KAKAO_TALK);
            arrayList.add(AuthType.KAKAO_TALK_ONLY);
        }
        if (Session.getCurrentSession().getAuthCodeManager().isStoryLoginAvailable()) {
            arrayList.add(AuthType.KAKAO_STORY);
        }
        arrayList.add(AuthType.KAKAO_ACCOUNT);
        AuthType[] authTypes = KakaoSDK.getAdapter().getSessionConfig().getAuthTypes();
        if (authTypes == null || authTypes.length == 0 || (authTypes.length == 1 && authTypes[0] == AuthType.KAKAO_LOGIN_ALL)) {
            authTypes = AuthType.values();
        }
        arrayList.retainAll(Arrays.asList(authTypes));
        if (arrayList.contains(AuthType.KAKAO_TALK)) {
            arrayList.remove(AuthType.KAKAO_TALK_ONLY);
        }
        if (arrayList.size() == 0) {
            arrayList.add(AuthType.KAKAO_ACCOUNT);
        }
        return arrayList;
    }

    public void setSuportFragment(Fragment fragment) {
        this.supportFragment = fragment;
    }

    public void setSupportFragment(Fragment fragment) {
        this.supportFragment = fragment;
    }

    public LoginButton(Context context) {
        super(context);
        MethodCollector.i(10951);
        MethodCollector.o(10951);
    }

    private ListAdapter createLoginAdapter(final Item[] itemArr) {
        return new ArrayAdapter<Item>(getContext(), 17367057, 16908308, itemArr) {
            /* class com.kakao.usermgmt.LoginButton.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34411);
            }

            public static Object com_kakao_usermgmt_LoginButton$2_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
                Object obj;
                MethodCollector.i(10461);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!i.f107220b && "connectivity".equals(str)) {
                        try {
                            new b().a();
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
                            MethodCollector.o(10461);
                        }
                    }
                } else {
                    obj = context.getSystemService(str);
                }
                return obj;
            }

            public View getView(int i2, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = a.a((LayoutInflater) com_kakao_usermgmt_LoginButton$2_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(getContext(), "layout_inflater"), R.layout.agi, viewGroup, false);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.civ);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView.setImageDrawable(LoginButton.this.getResources().getDrawable(itemArr[i2].icon, getContext().getTheme()));
                } else {
                    imageView.setImageDrawable(LoginButton.this.getResources().getDrawable(itemArr[i2].icon));
                }
                ((TextView) view.findViewById(R.id.cix)).setText(itemArr[i2].textId);
                return view;
            }
        };
    }

    public void openSession(AuthType authType) {
        if (getSupportFragment() != null) {
            Session.getCurrentSession().open(authType, getSupportFragment());
        } else {
            Session.getCurrentSession().open(authType, (Activity) getContext());
        }
    }

    private void showDialogWhilePreservingSystemVisibility(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setFlags(8, 8);
        }
        dialog.show();
        if (getActivity() != null && window != null) {
            window.getDecorView().setSystemUiVisibility(getActivity().getWindow().getDecorView().getSystemUiVisibility());
            window.clearFlags(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onClickLoginButton(List<AuthType> list) {
        if (list.size() == 1) {
            openSession(list.get(0));
            return;
        }
        Item[] createAuthItemArray = createAuthItemArray(list);
        showDialogWhilePreservingSystemVisibility(createLoginDialog(createAuthItemArray, createLoginAdapter(createAuthItemArray)));
    }

    private void applyFullscreenOptions(Dialog dialog) {
        int i2;
        Activity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            Window window2 = dialog.getWindow();
            if (window != null && window2 != null) {
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
                int i3 = window.getAttributes().flags;
                if (Build.VERSION.SDK_INT < 28) {
                    i2 = 0;
                } else {
                    i2 = activity.getWindow().getAttributes().layoutInDisplayCutoutMode;
                }
                window2.getDecorView().setSystemUiVisibility(systemUiVisibility);
                window2.addFlags(i3);
                if (Build.VERSION.SDK_INT >= 28) {
                    window2.getAttributes().layoutInDisplayCutoutMode = i2;
                }
            }
        }
    }

    private Item[] createAuthItemArray(List<AuthType> list) {
        ArrayList arrayList = new ArrayList();
        boolean contains = list.contains(AuthType.KAKAO_TALK);
        Integer valueOf = Integer.valueOf((int) R.drawable.bm4);
        if (contains) {
            arrayList.add(new Item(R.string.aim, valueOf, R.string.ain, AuthType.KAKAO_TALK));
        }
        if (list.contains(AuthType.KAKAO_TALK_ONLY)) {
            arrayList.add(new Item(R.string.aim, valueOf, R.string.ain, AuthType.KAKAO_TALK_ONLY));
        }
        if (list.contains(AuthType.KAKAO_STORY)) {
            arrayList.add(new Item(R.string.aik, Integer.valueOf((int) R.drawable.bkp), R.string.ail, AuthType.KAKAO_STORY));
        }
        if (list.contains(AuthType.KAKAO_ACCOUNT)) {
            arrayList.add(new Item(R.string.ait, Integer.valueOf((int) R.drawable.c5), R.string.aiu, AuthType.KAKAO_ACCOUNT));
        }
        return (Item[]) arrayList.toArray(new Item[0]);
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10952);
        MethodCollector.o(10952);
    }

    /* access modifiers changed from: protected */
    public Dialog createLoginDialog(final Item[] itemArr, ListAdapter listAdapter) {
        final Dialog dialog = new Dialog(getContext(), R.style.fy);
        dialog.requestWindowFeature(1);
        applyFullscreenOptions(dialog);
        dialog.setContentView(R.layout.agh);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setGravity(17);
        }
        ListView listView = (ListView) dialog.findViewById(R.id.ciu);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.kakao.usermgmt.LoginButton.AnonymousClass3 */

            static {
                Covode.recordClassIndex(34412);
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                AuthType authType = itemArr[i2].authType;
                if (authType != null) {
                    LoginButton.this.openSession(authType);
                }
                dialog.dismiss();
            }
        });
        ((Button) dialog.findViewById(R.id.ciq)).setOnClickListener(new View.OnClickListener() {
            /* class com.kakao.usermgmt.LoginButton.AnonymousClass4 */

            static {
                Covode.recordClassIndex(34413);
            }

            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        return dialog;
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(10954);
        MethodCollector.o(10954);
    }

    /* access modifiers changed from: package-private */
    public static class Item {
        final AuthType authType;
        final int contentDescId;
        public final int icon;
        final int textId;

        static {
            Covode.recordClassIndex(34414);
        }

        Item(int i2, Integer num, int i3, AuthType authType2) {
            this.textId = i2;
            this.icon = num.intValue();
            this.contentDescId = i3;
            this.authType = authType2;
        }
    }
}
