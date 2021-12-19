package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.activity.processor.d;
import com.ss.android.ugc.aweme.activity.processor.u;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.base.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout;
import com.ss.android.ugc.aweme.profile.arg.UserProfileArg;
import com.ss.android.ugc.aweme.profile.presenter.ac;
import com.ss.android.ugc.aweme.profile.presenter.v;
import com.ss.android.ugc.aweme.profile.ui.v2.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

@com.bytedance.ies.powerpage.a.a
public final class UserProfileFragment extends com.bytedance.ies.foundation.fragment.a implements com.bytedance.ies.powerpage.b, u, f, v {

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f116831e;

    /* renamed from: f  reason: collision with root package name */
    public SlideSwitchLayout f116832f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.activity.processor.d f116833g;

    /* renamed from: h  reason: collision with root package name */
    private final h f116834h = RouteArgExtension.INSTANCE.navArg(this, a.f116840a);

    /* renamed from: i  reason: collision with root package name */
    private Aweme f116835i;

    /* renamed from: j  reason: collision with root package name */
    private ac f116836j;

    /* renamed from: k  reason: collision with root package name */
    private DmtStatusView f116837k;

    /* renamed from: l  reason: collision with root package name */
    private String f116838l;

    /* renamed from: m  reason: collision with root package name */
    private SparseArray f116839m;

    static {
        Covode.recordClassIndex(75451);
    }

    private final UserProfileArg e() {
        return (UserProfileArg) this.f116834h.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f116839m == null) {
            this.f116839m = new SparseArray();
        }
        View view = (View) this.f116839m.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f116839m.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.activity.processor.u
    public final boolean a() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.activity.processor.u
    public final boolean a(int i2, KeyEvent keyEvent) {
        return false;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        SparseArray sparseArray = this.f116839m;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.base.f
    public final String c() {
        return "others_homepage";
    }

    @Override // com.bytedance.ies.powerpage.b
    public final void onActivityResult_Activity(int i2, int i3, Intent intent) {
        com.bytedance.ies.powerpage.c.a(this, i2, i3, intent);
    }

    @Override // com.bytedance.ies.powerpage.b
    public final void onBackPressed_Activity() {
        com.bytedance.ies.powerpage.c.a(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    @Override // com.bytedance.ies.powerpage.b
    public final void onNewIntent(Intent intent) {
    }

    private static com.ss.android.ugc.aweme.base.f.a h() {
        return new i();
    }

    private void i() {
        e activity = getActivity();
        if (activity != null) {
            l.b(activity, "");
            activity.finish();
            com.ss.android.ugc.aweme.push.a.a(activity);
            com.ss.android.ugc.aweme.miniapp_api.a.a(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.v
    public final void d() {
        DmtStatusView dmtStatusView = this.f116837k;
        if (dmtStatusView != null) {
            dmtStatusView.d();
        }
        try {
            e activity = getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        } catch (Exception unused) {
            i();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.activity.processor.d dVar = this.f116833g;
        if (dVar != null) {
            dVar.f65535b.activityConfiguration(new d.a(dVar));
        }
    }

    static final class a extends m implements h.f.a.a<UserProfileArg> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f116840a = new a();

        static {
            Covode.recordClassIndex(75452);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ UserProfileArg invoke() {
            return new UserProfileArg(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 67108863, null);
        }
    }

    private final void f() {
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        l.b(childFragmentManager, "");
        Fragment a2 = childFragmentManager.a("userprofilefragment");
        if (a2 == null) {
            a2 = h();
            a2.setArguments(g());
        }
        n a3 = childFragmentManager.a();
        l.b(a3, "");
        a3.b(R.id.fja, a2, "userprofilefragment").c();
    }

    private final Bundle g() {
        String str;
        Bundle bundle = new Bundle();
        bundle.putString("uid", e().getUserId());
        bundle.putString("sec_user_id", e().getSecUid());
        bundle.putString("profile_from", e().getLabel());
        bundle.putString("video_id", e().getAid());
        bundle.putString("profile_from", "other_user");
        bundle.putString(StringSet.type, e().getType());
        bundle.putString("enter_method", e().getEnterMethod());
        bundle.putString("enter_from", e().getEnterFrom());
        bundle.putString("position", e().getPosition());
        bundle.putString("profile_from_scene", e().getProfileFromScene());
        if (!TextUtils.isEmpty(e().getPreviousPage())) {
            bundle.putString("extra_previous_page", e().getPreviousPage());
        }
        bundle.putString("request_id", e().getLiveRequestId());
        bundle.putString("room_id", e().getLiveRoomId());
        bundle.putString("room_owner_id", e().getLiveRoomOwnerId());
        bundle.putString("user_type", e().getLiveType());
        String trackParams = e().getTrackParams();
        if (!TextUtils.isEmpty(trackParams)) {
            try {
                bundle.putString("show_window_source", new JSONObject(trackParams).optString("show_window_source"));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        bundle.putBoolean("is_live_record", e().isFromLiveRecord());
        bundle.putString("search_request_id", e().getSearchRequestId());
        bundle.putBoolean("isFromFeed", false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("extra_previous_page_position");
        } else {
            str = null;
        }
        bundle.putString("extra_previous_page_position", str);
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        l.b(arguments2, "");
        bundle.putString("enter_from_request_id", arguments2.getString("enter_from_request_id"));
        bundle.putString("scene_id", e().getSceneId());
        bundle.putInt("need_track_compare_recommend_reason", arguments2.getInt("need_track_compare_recommend_reason", 0));
        bundle.putString("previous_recommend_reason", arguments2.getString("previous_recommend_reason"));
        bundle.putString("recommend_from_type", arguments2.getString("recommend_from_type"));
        bundle.putInt("is_cold_launch", arguments2.getInt("is_cold_launch", 0));
        bundle.putInt("from_recommend_card", arguments2.getInt("from_recommend_card", 0));
        bundle.putString("id", arguments2.getString("id"));
        bundle.putInt("general_search_card_type", arguments2.getInt("general_search_card_type", 0));
        bundle.putBoolean("is_notify_miniapp_follow_status", arguments2.getBoolean("is_notify_miniapp_follow_status", false));
        bundle.putSerializable("recommend_enter_profile_params", arguments2.getSerializable("recommend_enter_profile_params"));
        bundle.putSerializable("extra_mutual_relation", arguments2.getSerializable("extra_mutual_relation"));
        bundle.putBoolean("extra_from_mutual", arguments2.getBoolean("extra_from_mutual", false));
        bundle.putString("event_keys", arguments2.getString("event_keys"));
        return bundle;
    }

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f116841a = new b();

        static {
            Covode.recordClassIndex(75453);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f116842a);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<BaseFragmentViewModel, z> {
        final /* synthetic */ x $config;

        static {
            Covode.recordClassIndex(75459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(x xVar) {
            super(1);
            this.$config = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            l.d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(new h.f.a.a<com.bytedance.ies.foundation.base.a>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.UserProfileFragment.d.AnonymousClass1 */
                final /* synthetic */ d this$0;

                static {
                    Covode.recordClassIndex(75460);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ com.bytedance.ies.foundation.base.a invoke() {
                    return this.this$0.$config;
                }
            });
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
    }

    @Override // com.bytedance.ies.powerpage.b
    public final void onBeforeActivityCreated(Activity activity) {
        Activity activity2;
        if (!(activity instanceof com.bytedance.ies.foundation.activity.a)) {
            activity2 = null;
        } else {
            activity2 = activity;
        }
        com.bytedance.ies.foundation.activity.a aVar = (com.bytedance.ies.foundation.activity.a) activity2;
        if (aVar != null) {
            aVar.activityConfiguration(new c(this, activity));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x xVar = new x(0, false, false, 7);
        xVar.f65561g = R.color.f159928l;
        xVar.f65558d = R.color.f159928l;
        xVar.f65562h = true;
        a(new d(xVar));
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ UserProfileFragment this$0;

        static {
            Covode.recordClassIndex(75455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UserProfileFragment userProfileFragment, Activity activity) {
            super(1);
            this.this$0 = userProfileFragment;
            this.$activity = activity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f116843a);
            baseActivityViewModel2.config(AnonymousClass2.f116844a);
            if (Build.VERSION.SDK_INT >= 21) {
                baseActivityViewModel2.config(new h.f.a.a<com.bytedance.ies.foundation.base.a>(this) {
                    /* class com.ss.android.ugc.aweme.profile.ui.UserProfileFragment.c.AnonymousClass3 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(75458);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ com.bytedance.ies.foundation.base.a invoke() {
                        com.ss.android.ugc.aweme.activity.processor.d dVar = new com.ss.android.ugc.aweme.activity.processor.d((com.bytedance.ies.foundation.activity.a) this.this$0.$activity, this.this$0.this$0, (byte) 0);
                        this.this$0.this$0.f116833g = dVar;
                        return dVar;
                    }
                });
            }
            return z.f158842a;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.activity.processor.u
    public final void a(int i2, Intent intent) {
        e activity = getActivity();
        if (activity != null) {
            l.b(activity, "");
            com.ss.android.ugc.aweme.detail.transition.a.a(activity, i2);
            if (-1 == i2 && intent != null) {
                String a2 = a(intent, "feed_share_element_aid");
                androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
                l.b(childFragmentManager, "");
                if (childFragmentManager.a("userprofilefragment") instanceof com.ss.android.ugc.aweme.profile.ui.d.d) {
                    Fragment a3 = childFragmentManager.a("userprofilefragment");
                    Objects.requireNonNull(a3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.uiinterface.IUserProfile");
                    ((com.ss.android.ugc.aweme.profile.ui.d.d) a3).e(a2);
                } else if (childFragmentManager.a("myprofilefragment") instanceof com.ss.android.ugc.aweme.profile.ui.d.b) {
                    Fragment a4 = childFragmentManager.a("myprofilefragment");
                    Objects.requireNonNull(a4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.uiinterface.IMyProfile");
                    ((com.ss.android.ugc.aweme.profile.ui.d.b) a4).a(a2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.v
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        e().setUserId(str);
        e().setSecUid(str2);
        f();
        DmtStatusView dmtStatusView = this.f116837k;
        if (dmtStatusView != null) {
            dmtStatusView.d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013f, code lost:
        if (android.text.TextUtils.equals(r1, r0.getCurUserId()) != false) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d2  */
    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 561
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.UserProfileFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.an8, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1) {
            if (i3 == 2) {
                SlideSwitchLayout slideSwitchLayout = this.f116832f;
                if (slideSwitchLayout != null) {
                    slideSwitchLayout.setCurrentItem("page_profile");
                    return;
                }
                return;
            }
        } else if (i2 == 10086 && i3 == -1) {
            e activity = getActivity();
            if (activity != null) {
                activity.setResult(-1, intent);
            }
            b(b.f116841a);
            i();
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }
}
