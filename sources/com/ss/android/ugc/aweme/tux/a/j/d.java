package com.ss.android.ugc.aweme.tux.a.j;

import android.content.Context;
import android.view.ViewGroup;
import com.a.b.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import h.f.b.l;

public final class d {
    static {
        Covode.recordClassIndex(92520);
    }

    public static void a(TuxButton tuxButton, ViewGroup.LayoutParams layoutParams) {
        l.d(tuxButton, "");
        l.d(layoutParams, "");
    }

    public static boolean a(String str, a aVar, TuxButton tuxButton, ViewGroup.LayoutParams layoutParams) {
        String str2;
        String str3;
        l.d(str, "");
        l.d(aVar, "");
        l.d(tuxButton, "");
        l.d(layoutParams, "");
        switch (str.hashCode()) {
            case -1909861454:
                if (str.equals("app:tux_buttonVariant") && (str2 = aVar.f4926a) != null) {
                    switch (str2.hashCode()) {
                        case -1908079720:
                            if (str2.equals("const_secondary")) {
                                tuxButton.setButtonVariant(2);
                                break;
                            }
                            break;
                        case -817598092:
                            if (str2.equals("secondary")) {
                                tuxButton.setButtonVariant(1);
                                break;
                            }
                            break;
                        case -314765822:
                            if (str2.equals("primary")) {
                                tuxButton.setButtonVariant(0);
                                break;
                            }
                            break;
                        case 3387192:
                            if (str2.equals("none")) {
                                tuxButton.setButtonVariant(-1);
                                break;
                            }
                            break;
                    }
                }
                break;
            case -1164020445:
                if (str.equals("app:tux_drawableStart")) {
                    Context context = tuxButton.getContext();
                    l.b(context, "");
                    tuxButton.setButtonStartIcon(Integer.valueOf(com.a.b.b.a.b(context, aVar)));
                    return true;
                }
                break;
            case -697836383:
                if (str.equals("app:tux_iconHeight")) {
                    Context context2 = tuxButton.getContext();
                    l.b(context2, "");
                    tuxButton.setIconHeight(h.g.a.a(com.a.b.b.a.a(context2, aVar)));
                    return true;
                }
                break;
            case -553081260:
                if (str.equals("app:tux_loadingIcon")) {
                    Context context3 = tuxButton.getContext();
                    l.b(context3, "");
                    tuxButton.setLoadingIcon(com.a.b.b.a.b(context3, aVar));
                    return true;
                }
                break;
            case 253523420:
                if (str.equals("app:tux_drawableEnd")) {
                    Context context4 = tuxButton.getContext();
                    l.b(context4, "");
                    tuxButton.setButtonEndIcon(Integer.valueOf(com.a.b.b.a.b(context4, aVar)));
                    return true;
                }
                break;
            case 486716404:
                if (str.equals("app:tux_buttonSize") && (str3 = aVar.f4926a) != null) {
                    switch (str3.hashCode()) {
                        case -1078030475:
                            if (str3.equals("medium")) {
                                tuxButton.setButtonSize(2);
                                break;
                            }
                            break;
                        case 3387192:
                            if (str3.equals("none")) {
                                tuxButton.setButtonSize(-1);
                                break;
                            }
                            break;
                        case 3560192:
                            if (str3.equals("tiny")) {
                                tuxButton.setButtonSize(0);
                                break;
                            }
                            break;
                        case 102742843:
                            if (str3.equals("large")) {
                                tuxButton.setButtonSize(3);
                                break;
                            }
                            break;
                        case 109548807:
                            if (str3.equals("small")) {
                                tuxButton.setButtonSize(1);
                                break;
                            }
                            break;
                    }
                }
                break;
            case 902192320:
                if (str.equals("app:tux_buttonAutoSizing")) {
                    tuxButton.a(com.a.b.b.a.a(aVar));
                    return true;
                }
                break;
            case 1931119372:
                if (str.equals("app:tux_iconWidth")) {
                    Context context5 = tuxButton.getContext();
                    l.b(context5, "");
                    tuxButton.setIconWidth(h.g.a.a(com.a.b.b.a.a(context5, aVar)));
                    return true;
                }
                break;
        }
        return false;
    }
}
