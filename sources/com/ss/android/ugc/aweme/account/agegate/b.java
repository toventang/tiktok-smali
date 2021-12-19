package com.ss.android.ugc.aweme.account.agegate;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import java.util.Calendar;
import java.util.Date;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f62627b;

    /* renamed from: c  reason: collision with root package name */
    private static String f62628c = "";

    /* renamed from: a  reason: collision with root package name */
    public a f62629a;

    public interface a {
        static {
            Covode.recordClassIndex(38555);
        }

        void a();

        void b();

        void c();

        void d();
    }

    static {
        Covode.recordClassIndex(38554);
    }

    public static void a(DatePicker datePicker, Date date) {
        Calendar instance = Calendar.getInstance();
        instance.set(6, instance.getActualMaximum(6));
        if (!com.ss.android.ugc.aweme.account.agegate.util.b.a()) {
            instance.add(1, -1);
        }
        if (date == null) {
            date = com.ss.android.ugc.aweme.account.login.v2.a.b();
        }
        if (instance.getTime().before(date)) {
            instance = Calendar.getInstance();
            instance.set(date.getYear() + 1900, 11, 31);
        }
        a(datePicker, instance, date);
    }

    public static void a(DatePicker datePicker, Calendar calendar, Date date) {
        datePicker.setNonRecurrentForYear(true);
        datePicker.a(date);
        datePicker.setUpperBoundDate(calendar);
    }

    public static void a(Context context, String str, String str2, int i2, String str3, int i3) {
        if (context != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//account/login/signup_or_login");
            buildRoute.withParam("is_existing_user", true);
            buildRoute.withParam("next_page", k.EDIT_DOB_AGE_GATE.getValue());
            buildRoute.withParam("enter_type", "click_login");
            buildRoute.withParam("default_dob", str);
            buildRoute.withParam("enter_method", str2);
            buildRoute.withParam("enter_from", "age_edit_page");
            buildRoute.withParam("user_age_status", i2);
            buildRoute.withParam("upper_bound_date", str3);
            buildRoute.withParam("description_type", i3);
            buildRoute.open();
        }
    }
}
