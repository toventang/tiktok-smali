package com.ss.android.ugc.aweme.challenge.ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.zhiliaoapp.musically.R;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final a f70187a = new a((byte) 0);

    static {
        Covode.recordClassIndex(43296);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43297);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static AdPopUpWebPageView b(Activity activity) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout a2 = a(activity);
            if (a2 != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) a2.findViewById(R.id.a4_);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        public static FrameLayout a(Activity activity) {
            View view;
            MethodCollector.i(2107);
            if (activity != null) {
                ViewStub viewStub = (ViewStub) activity.findViewById(R.id.akb);
                if (viewStub != null && viewStub.getParent() != null) {
                    view = viewStub.inflate();
                    if (view == null) {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                        MethodCollector.o(2107);
                        throw nullPointerException;
                    }
                } else if (activity != null) {
                    view = activity.findViewById(R.id.a45);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                MethodCollector.o(2107);
                return frameLayout;
            }
            MethodCollector.o(2107);
            return null;
        }
    }
}
