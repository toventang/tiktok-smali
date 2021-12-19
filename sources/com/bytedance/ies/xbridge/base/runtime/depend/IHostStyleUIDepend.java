package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.b.c;
import h.f.b.l;

public interface IHostStyleUIDepend {
    public static final a Companion = a.f35867a;

    public static final class b {
        static {
            Covode.recordClassIndex(21429);
        }

        public static Boolean a(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener) {
            l.c(actionSheetBuilder, "");
            l.c(showActionSheetListener, "");
            return null;
        }
    }

    static {
        Covode.recordClassIndex(21427);
    }

    Boolean hideLoading(c cVar);

    Boolean showActionSheet(ActionSheetBuilder actionSheetBuilder, ShowActionSheetListener showActionSheetListener);

    Boolean showDialog(DialogBuilder dialogBuilder);

    Boolean showLoading(c cVar);

    Boolean showToast(ToastBuilder toastBuilder);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f35867a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(21428);
        }
    }
}
