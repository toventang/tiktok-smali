package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public final class ib {

    /* renamed from: a  reason: collision with root package name */
    private static Locale f143084a = SettingServiceImpl.v().q();

    /* renamed from: b  reason: collision with root package name */
    private static final SimpleDateFormat f143085b = new SimpleDateFormat("yyyy-MM-dd", f143084a);

    /* renamed from: c  reason: collision with root package name */
    private static final SimpleDateFormat f143086c = new SimpleDateFormat("MM-dd", f143084a);

    /* renamed from: d  reason: collision with root package name */
    private static final SimpleDateFormat f143087d = new SimpleDateFormat("M/d/yyyy", f143084a);

    /* renamed from: e  reason: collision with root package name */
    private static final SimpleDateFormat f143088e = new SimpleDateFormat("M/d", f143084a);

    /* renamed from: f  reason: collision with root package name */
    private static final SimpleDateFormat f143089f = new SimpleDateFormat("MM-dd", Locale.getDefault());

    /* renamed from: g  reason: collision with root package name */
    private static final SimpleDateFormat f143090g = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    static {
        Covode.recordClassIndex(93661);
    }

    public static int a(long j2) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (timeInMillis <= 86400000) {
            return 1;
        }
        if (timeInMillis <= 172800000) {
            return 2;
        }
        if (timeInMillis <= 604800000) {
            return 3;
        }
        if (timeInMillis <= 2592000000L) {
            return 4;
        }
        return 5;
    }

    public static int a(Long l2) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(l2.longValue()));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date());
        instance2.set(11, 0);
        instance2.set(12, 0);
        instance2.set(13, 0);
        instance2.set(14, 0);
        return (int) ((instance2.getTime().getTime() - instance.getTime().getTime()) / 86400000);
    }

    public static String b(Context context, long j2) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (timeInMillis < 60000) {
            return context.getString(R.string.cqe);
        }
        if (timeInMillis < 3600000) {
            return context.getString(R.string.gg4, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gg2, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gg0, Long.valueOf(timeInMillis / 86400000));
        } else {
            return context.getString(R.string.gg7, Long.valueOf(timeInMillis / 604800000));
        }
    }

    public static String a(Context context, long j2) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (timeInMillis < 60000) {
            long j3 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j3 <= 0) {
                j3 = 1;
            }
            objArr[0] = Long.valueOf(j3);
            return context.getString(R.string.fe_, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.gg4, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gg2, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gg0, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j4 = timeInMillis - 604800000;
            if (j4 <= 0 || j4 > 86400000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j2);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j2 >= instance2.getTimeInMillis() + 86400000) {
                    return f143086c.format(instance.getTime());
                }
                return f143085b.format(instance.getTime());
            }
            return context.getString(R.string.gg7, 1);
        }
    }

    public static String c(Context context, long j2) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (timeInMillis < 60000) {
            long j3 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j3 <= 0) {
                j3 = 1;
            }
            objArr[0] = Long.valueOf(j3);
            return context.getString(R.string.fe_, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.gg4, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gg2, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gg0, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j4 = timeInMillis - 604800000;
            if (j4 <= 0 || j4 > 86400000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j2);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j2 >= instance2.getTimeInMillis() + 86400000) {
                    return f143086c.format(instance.getTime());
                }
                return f143085b.format(instance.getTime());
            }
            return context.getString(R.string.gg7, 1);
        }
    }

    public static String d(Context context, long j2) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j3 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j3 == 0) {
                j3 = 1;
            }
            objArr[0] = Long.valueOf(j3);
            return context.getString(R.string.gg6, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.gg5, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gg3, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gg1, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j4 = timeInMillis - 604800000;
            if (j4 <= 0 || j4 > 86400000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j2);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j2 >= instance2.getTimeInMillis() + 86400000) {
                    return f143086c.format(instance.getTime());
                }
                return f143085b.format(instance.getTime());
            }
            return context.getString(R.string.gg8, 1);
        }
    }

    public static String e(Context context, long j2) {
        Calendar instance = Calendar.getInstance();
        long timeInMillis = instance.getTimeInMillis() - j2;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j3 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j3 == 0) {
                j3 = 1;
            }
            objArr[0] = Long.valueOf(j3);
            return context.getString(R.string.fj0, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.fiz, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.fiy, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.fix, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j4 = timeInMillis - 604800000;
            if (j4 <= 0 || j4 > 86400000) {
                Calendar calendar = (Calendar) instance.clone();
                calendar.setTimeInMillis(j2);
                Calendar calendar2 = (Calendar) instance.clone();
                calendar2.set(6, 0);
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                if (j2 >= calendar2.getTimeInMillis() + 86400000) {
                    return context.getString(R.string.fiv, f143088e.format(calendar.getTime()));
                }
                return context.getString(R.string.fiv, f143087d.format(calendar.getTime()));
            }
            return context.getString(R.string.fj1, 1);
        }
    }

    public static String f(Context context, long j2) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis() - j2;
        if (timeInMillis <= 0) {
            return "";
        }
        if (timeInMillis < 60000) {
            long j3 = timeInMillis / 1000;
            Object[] objArr = new Object[1];
            if (j3 == 0) {
                j3 = 1;
            }
            objArr[0] = Long.valueOf(j3);
            return context.getString(R.string.gg6, objArr);
        } else if (timeInMillis < 3600000) {
            return context.getString(R.string.gg5, Long.valueOf(timeInMillis / 60000));
        } else if (timeInMillis < 86400000) {
            return context.getString(R.string.gg3, Long.valueOf(timeInMillis / 3600000));
        } else if (timeInMillis < 604800000) {
            return context.getString(R.string.gg1, Long.valueOf(timeInMillis / 86400000));
        } else {
            long j4 = timeInMillis - 604800000;
            if (j4 <= 0 || j4 > 86400000) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j2);
                Calendar instance2 = Calendar.getInstance();
                instance2.set(6, 0);
                instance2.set(11, 0);
                instance2.set(12, 0);
                instance2.set(13, 0);
                if (j2 >= instance2.getTimeInMillis() + 86400000) {
                    return f143088e.format(instance.getTime());
                }
                return f143087d.format(instance.getTime());
            }
            return context.getString(R.string.gg8, 1);
        }
    }
}
