package com.ss.android.ugc.aweme.tux.business.a;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.business.story.StoryBrandView;
import com.ss.android.ugc.aweme.tux.business.story.b;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(92523);
    }

    public static void a(StoryBrandView storyBrandView, ViewGroup.LayoutParams layoutParams) {
        l.d(storyBrandView, "");
        l.d(layoutParams, "");
    }

    public static boolean a(String str, com.a.b.a.a aVar, StoryBrandView storyBrandView, ViewGroup.LayoutParams layoutParams) {
        l.d(str, "");
        l.d(aVar, "");
        l.d(storyBrandView, "");
        l.d(layoutParams, "");
        switch (str.hashCode()) {
            case -1535121397:
                if (!str.equals("app:radius")) {
                    return false;
                }
                Context context = storyBrandView.getContext();
                l.b(context, "");
                storyBrandView.setRadius(com.a.b.b.a.a(context, aVar));
                return true;
            case 681713385:
                if (!str.equals("app:theme_type")) {
                    return false;
                }
                String str2 = aVar.f4926a;
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -358423381) {
                        if (hashCode != -350297506) {
                            if (hashCode == 1373927726 && str2.equals("brand_dark")) {
                                storyBrandView.setThemeType(b.DARK);
                            }
                        } else if (str2.equals("brand_light")) {
                            storyBrandView.setThemeType(b.LIGHT);
                        }
                    } else if (str2.equals("brand_const")) {
                        storyBrandView.setThemeType(b.CONST);
                    }
                }
                return true;
            case 887664112:
                if (!str.equals("app:ring_width")) {
                    return false;
                }
                Context context2 = storyBrandView.getContext();
                l.b(context2, "");
                storyBrandView.setRingWidth(com.a.b.b.a.a(context2, aVar));
                return true;
            case 1506662996:
                if (!str.equals("app:brand_mode")) {
                    return false;
                }
                String str3 = aVar.f4926a;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1459637676:
                            if (str3.equals("brand_fill_circle")) {
                                storyBrandView.setMode(com.ss.android.ugc.aweme.tux.business.story.a.BRAND_FILL_CIRCLE);
                                break;
                            }
                            break;
                        case -1001078227:
                            if (str3.equals("progress")) {
                                storyBrandView.setMode(com.ss.android.ugc.aweme.tux.business.story.a.PRORGRESS);
                                break;
                            }
                            break;
                        case -923427188:
                            if (str3.equals("gray_ring")) {
                                storyBrandView.setMode(com.ss.android.ugc.aweme.tux.business.story.a.GRAY_RING);
                                break;
                            }
                            break;
                        case -785375970:
                            if (str3.equals("red_ring")) {
                                storyBrandView.setMode(com.ss.android.ugc.aweme.tux.business.story.a.RED_RING);
                                break;
                            }
                            break;
                        case 1374352360:
                            if (str3.equals("brand_ring")) {
                                storyBrandView.setMode(com.ss.android.ugc.aweme.tux.business.story.a.BRAND_RING);
                                break;
                            }
                            break;
                        case 1639822566:
                            if (str3.equals("brand_background")) {
                                storyBrandView.setMode(com.ss.android.ugc.aweme.tux.business.story.a.BRAND_BACKGROUND);
                                break;
                            }
                            break;
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
