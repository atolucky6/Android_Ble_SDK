package com.timaimee.vpdemo.activity;

/**
 * Created by Administrator on 2017/11/25.
 */

public interface Oprate {
    String PWD_COMFIRM = "1. Device password-verification";
    String PWD_COMFIRM_2_DISCONNECT = "Initiate BT and disconnect immediately";
    String PWD_COMFIRM_2_DISCONNECT_ = "Disconnect BLE directly";
    String PERSONINFO_SYNC = "2. Personal information-settings";
    String SETTING_FIRST = "<--Previous operation 1, 2";
    String PWD_MODIFY = "Device password-modify";
    String TEMPTURE_DETECT_START = "Measure Temperature - Start";
    String TEMPTURE_DETECT_STOP = "Measure temperature - end";
    String HEART_DETECT_START = "Measure heart rate-start";
    String HEART_DETECT_STOP = "Measure heart rate - end";
    String BP_DETECT_START = "Measure blood pressure - start";
    String BP_DETECT_STOP = "Measuring Blood Pressure - End";
    String BP_DETECTMODEL_SETTING = "Blood Pressure Mode-Settings";
    String BP_DETECTMODEL_SETTING_ADJUSTE = "Blood Pressure Mode [Dynamic Adjustment]-Settings";
    String BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL = "Blood Pressure Mode [Dynamic Adjustment]-Cancel";
    String BP_DETECTMODEL_READ = "Blood Pressure Mode-Read";
    String SPORT_CURRENT_READ = "Current step count - read";
    String CAMERA_START = "Photo mode-Start";
    String CAMERA_STOP = "Photo mode-Stop";
    String ALARM_SETTING = "Alarm Clock-Settings";
    String ALARM_READ = "Alarm clock-read";
    String ALARM_NEW_READ = "New Alarm Clock - Read";
    String ALARM_NEW_ADD = "New Alarm Clock - Added";
    String ALARM_NEW_MODIFY = "New Alarm Clock - Modified";
    String ALARM_NEW_DELETE = "New Alarm Clock - Delete";
    String ALARM_NEW_LISTENER = "New alarm clock - listen for status changes";
    String LONGSEAT_SETTING_OPEN = "Sedentary - On";
    String LONGSEAT_SETTING_CLOSE = "Sedentary - Off";
    String LONGSEAT_READ = "Sedentary - Read";
    String LANGUAGE_CHINESE = "Language settings-Chinese";
    String LANGUAGE_ENGLISH = "Language settings-English";
    String BATTERY = "Battery status - read";
    String NIGHT_TURN_WRIST_OPEN = "Turn your wrist at night - open";
    String NIGHT_TURN_WRIST_CLOSE = "Wrist turn at night - off";
    String NIGHT_TURN_WRIST_READ = "Turn your wrist at night - read";
    String NIGHT_TURN_WRIST_CUSTOM_TIME = "Turn your wrist at night-custom time";
    String NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL = "Wrist Turn at Night - Customize Time and Level";
    String FINDPHONE = "Anti-lost mobile phone";
    String CHECK_WEAR_SETING_OPEN = "Wear detection - open";
    String CHECK_WEAR_SETING_CLOSE = "Wear detection-off";
    String FINDDEVICE_SETTING_OPEN = "Device anti-lost-open";
    String FINDDEVICE_SETTING_CLOSE = "Device loss prevention-off";
    String FINDDEVICE_READ = "Be prepared to lose - read";
    String DEVICE_COUSTOM_READ = "Personalize-Read";
    String DEVICE_COUSTOM_SETTING = "Personalization-Settings";
    String DEVICE_ECG_ALWAYS_OPEN = "ECG normally on-on";
    String DEVICE_ECG_ALWAYS_CLOSE = "ECG normally on-off";
    String SOCIAL_MSG_SETTING = "Social message reminder 1 pack-settings";
    String SOCIAL_MSG_SETTING2 = "Social Message Reminder 2 Pack-Settings";
    String SOCIAL_MSG_READ = "Social message reminder-read settings";
    String SOCIAL_MSG_SEND = "Social message reminder-send content";
    String SOCIAL_PHONE_IDLE_OR_OFFHOOK = "Social message reminder-received call";
    String DEVICE_CONTROL_PHONE = "Monitoring bracelet-hang up, mute";
    String HEARTWRING_READ = "Heart rate alarm-read";
    String HEARTWRING_OPEN = "Heart rate alarm-on";
    String HEARTWRING_CLOSE = "Heart rate alarm-off";
    String SPO2H_OPEN = "Blood Oxygen - Reading";
    String SPO2H_CLOSE = "Blood oxygen-end";
    String SPO2H_AUTO_DETECT_READ = "Blood oxygen automatic detection-reading";
    String SPO2H_AUTO_DETECT_OPEN = "Automatic blood oxygen detection-on";
    String SPO2H_AUTO_DETECT_CLOSE = "Automatic blood oxygen detection-off";
    String FATIGUE_OPEN = "Fatigue - read";
    String FATIGUE_CLOSE = "Fatigue - End";
    String WOMEN_SETTING = "Female Status-Settings";
    String WOMEN_READ = "Female Status - Read";
    String COUNT_DOWN_WATCH_CLOSE_UI = "Countdown - use the watch alone (close the interface)";
    String COUNT_DOWN_WATCH_OPEN_UI = "Countdown - use the watch alone (open the interface)";
    String COUNT_DOWN_APP = "Countdown-App usage";
    String COUNT_DOWN_APP_READ = "Countdown-Read";
    String GPS_KAABA = "GPS Time Zone & Kaaba";
    String GPS_REPORT_START = "GPS reporting";
    String READ_CHANTING = "Read chants";
    String SCREEN_LIGHT_SETTING = "Screen adjustment-settings";
    String SCREEN_LIGHT_READ = "Screen adjustment-read";
    String SCREEN_STYLE_READ = "Screen Style-Read";
    String SCREEN_STYLE_SETTING = "Screen Style-Settings";
    String AIM_SPROT_CALC = "Target number of steps - calculation";
    String INSTITUTION_TRANSLATION = "Metric to Imperial conversion";
    String READ_TEMPTURE_DATA = "Read temperature data";
    String READ_HEALTH_DRINK = "Reading health data-drinking";
    String READ_HEALTH_SLEEP = "Read health data-sleep";
    String READ_HEALTH_SLEEP_FROM = "Read health data-sleep-from day";
    String READ_HEALTH_SLEEP_SINGLEDAY = "Read health data-sleep-read this day";
    String READ_HEALTH_ORIGINAL = "Read health data - 5 minutes";
    String READ_HEALTH_ORIGINAL_FROM = "Read health data - from what date";
    String READ_HEALTH_ORIGINAL_SINGLEDAY = "Read health data - read this day";
    String READ_HEALTH = "Read health data-all";
    String OAD = "Firmware upgrade";
    String SHOW_SP = "showsp";
    String SPORT_MODE_ORIGIN_READ = "Read data - sports mode";
    String SPORT_MODE_ORIGIN_READSTAUTS = "Read status-sport mode";
    String SPORT_MODE_ORIGIN_START = "Turn on - sport mode";
    String SPORT_MODE_START_INDOOR = "On-Indoor Walking";
    String SPORT_MODE_ORIGIN_END = "End - sport mode";
    String SPO2H_ORIGIN_READ = "Read data-blood oxygen data";
    String HRV_ORIGIN_READ = "Read data-HRV data";
    String CLEAR_DEVICE_DATA = "clear data";
    String DISCONNECT = "Bluetooth connection-disconnected";
    String DETECT_PTT = "PTT";
    String DETECT_START_ECG = "Start measuring ECG";
    String DETECT_STOP_ECG = "End measuring ECG";
    String LOW_POWER_READ = "Low power consumption - read";
    String LOW_POWER_OPEN = "Low power consumption-on";
    String LOW_POWER_CLOSE = "Low Power Consumption-Off";
    String S22_READ_DATA = "S22-Data reading";
    String S22_READ_STATE = "S22-status reading";
    String S22_SETTING_STATE_OPEN = "S22-Status setting (on)";
    String S22_SETTING_STATE_CLOSE = "S22-Status setting (off)";
    String BP_FUNCTION_READ = "Blood pressure status (read)";
    String BP_FUNCTION_SETTING = "Blood pressure status (settings)";
    String WEATHER_READ_STATUEINFO = "Weather status (read)";
    String SET_WATCH_TIME = "Set time";
    String WEATHER_SETTING_STATUEINFO_ON = "Weather status (on)";
    String WEATHER_SETTING_STATUEINFO_OFF = "Weather status (off)";
    String WEATHER_SETTING_DATA = "Weather data (settings)";

    String LIANSUO_SOS = "Lianshuo-Monitoring SOS";
    String LIANSUO_SEND_ORDER = "Lianshuo-Send command";
    String LIANSUO_SEND_CONTENT = "Lianshuo-Send content";
    String UI_UPDATE_AGPS = "UI upgrade-AGPS";
    String UI_UPDATE_CUSTOM = "UI upgrade-customized watch face";
    String UI_UPDATE_SERVER = "UI upgrade-server dial";
    String SYNC_MUSIC_INFO_PLAY = "play music";
    String SYNC_MUSIC_INFO_PAUSE = "music-pause";
    String VOLUME = "Volume";
    String UI_UPDATE_G15IMG = "UI upgrade-G15 image transfer";
    String TEXT_ALARM_ADD = "Add text alarm clock";
    String TEXT_ALARM_MODIFY = "Text alarm clock modification";
    String TEXT_ALARM_READ = "text alarm clock reading";
    String TEXT_ALARM_DELETE = "text alarm delete";
    String TEXT_ALARM = "text alarm clock";
    String ORIGIN_LOG = "Raw data log";
    String RR = "RR hop-by-frame";
    String G15_QR_CODE = "G15 QR code";
    String ECG_AUTO_REPORT_TEXT = "ECG normally open data monitoring";
    String START_BLOOD_GLUCOSE = "Start blood glucose monitoring";
    String STOP_BLOOD_GLUCOSE = "Stop blood glucose monitoring";
    String BLOOD_GLUCOSE_P_READ = "Blood glucose private mode reading";
    String BLOOD_GLUCOSE_P_SETTING = "Blood sugar private mode settings";

    String BLOOD_GLUCOSE_MULTIPLE_READ = "Blood glucose multi-calibration reading";
    String BLOOD_GLUCOSE_MULTIPLE_SETTING = "Blood glucose multi-calibration settings";
    String FIND_DEVICE = "Find mobile phone";
    String BLE_RENAME = "Bluetooth 4.0 rename";
    String BT_RENAME = "Bluetooth 3.0 rename";
    String BT_CONNECT = "Connect to BT";
    String BT_CLOSE = "Close BT";
    String BLE_DISCONNECT = "Disconnect BLE";
    String BT_READ = "Read BT";
    String HEALTH_REMIND = "Health reminder";
    String JL_NOTIFY_OPEN = "Health reminder";
    String JL_AUTH = "Health reminder";
    String JL_INIT_FILE_SYS = "jerry file system";
    String JL_SET_PHOTO_DIAL = "Jerry dial settings";

    String JL_DEVICE = "Jerry watches related";

    String JL_DEVICE_OTA = "Jerry OTA";

    String CONTACT = "Contact person";
    String GATT_CLOSE = "Gatt-Close";
    String FUNCTION_SWITCH = "Global monitoring switch";
    String READ_ECG_ID = "Read ECG ID";
    String READ_ECG_DATA = "Read ECG data";
    String SET_ECG_NEW_DATA_REPORT = "Monitor new ecg data reporting";
    String NONE = "NONE";
    String[] oprateStr = new String[]{
            PWD_COMFIRM, PWD_COMFIRM_2_DISCONNECT, PWD_COMFIRM_2_DISCONNECT_, PERSONINFO_SYNC, SETTING_FIRST, DISCONNECT, BT_CONNECT, BLE_DISCONNECT, PWD_MODIFY,
            GPS_KAABA, GPS_REPORT_START, READ_CHANTING, HEART_DETECT_START, HEART_DETECT_STOP, TEMPTURE_DETECT_START, TEMPTURE_DETECT_STOP, READ_TEMPTURE_DATA, BP_DETECT_START, BP_DETECT_STOP, BP_DETECTMODEL_SETTING, BP_DETECTMODEL_READ,
            BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL, BP_DETECTMODEL_SETTING_ADJUSTE,
            SPORT_CURRENT_READ, CAMERA_START, CAMERA_STOP, ALARM_SETTING, ALARM_READ, ALARM_NEW_READ, ALARM_NEW_ADD, ALARM_NEW_MODIFY, ALARM_NEW_DELETE, ALARM_NEW_LISTENER,
            LONGSEAT_SETTING_OPEN, LONGSEAT_SETTING_CLOSE, LONGSEAT_READ, LANGUAGE_CHINESE, LANGUAGE_ENGLISH,
            BATTERY, NIGHT_TURN_WRIST_OPEN, NIGHT_TURN_WRIST_CLOSE, NIGHT_TURN_WRIST_READ, NIGHT_TURN_WRIST_CUSTOM_TIME, NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL,
            DEVICE_COUSTOM_READ, DEVICE_COUSTOM_SETTING, DEVICE_ECG_ALWAYS_OPEN, DEVICE_ECG_ALWAYS_CLOSE, FINDPHONE,
            CHECK_WEAR_SETING_OPEN, CHECK_WEAR_SETING_CLOSE,
            FINDDEVICE_SETTING_OPEN, FINDDEVICE_SETTING_CLOSE, FINDDEVICE_READ,
            SOCIAL_MSG_SETTING, SOCIAL_MSG_SETTING2, SOCIAL_MSG_READ, SOCIAL_MSG_SEND, DEVICE_CONTROL_PHONE, SOCIAL_PHONE_IDLE_OR_OFFHOOK, HEARTWRING_READ, HEARTWRING_OPEN, HEARTWRING_CLOSE,
            SPO2H_OPEN, SPO2H_CLOSE, SPO2H_AUTO_DETECT_READ, SPO2H_AUTO_DETECT_OPEN, SPO2H_AUTO_DETECT_CLOSE, FATIGUE_OPEN, FATIGUE_CLOSE, WOMEN_SETTING, WOMEN_READ, COUNT_DOWN_WATCH_CLOSE_UI, COUNT_DOWN_WATCH_OPEN_UI, COUNT_DOWN_APP_READ, SCREEN_LIGHT_SETTING, SCREEN_LIGHT_READ, SCREEN_STYLE_READ, SCREEN_STYLE_SETTING, AIM_SPROT_CALC, INSTITUTION_TRANSLATION,
            READ_HEALTH_SLEEP, READ_HEALTH_SLEEP_FROM, READ_HEALTH_SLEEP_SINGLEDAY, READ_HEALTH_DRINK, READ_HEALTH_ORIGINAL,
            READ_HEALTH_ORIGINAL_FROM, READ_HEALTH_ORIGINAL_SINGLEDAY, READ_HEALTH, SET_WATCH_TIME,
            OAD, SHOW_SP, SPORT_MODE_ORIGIN_READ, SPORT_MODE_ORIGIN_READSTAUTS, SPORT_MODE_START_INDOOR, SPORT_MODE_ORIGIN_START, SPORT_MODE_ORIGIN_END, SPO2H_ORIGIN_READ, HRV_ORIGIN_READ, CLEAR_DEVICE_DATA
            , DETECT_START_ECG, DETECT_STOP_ECG, NONE, LOW_POWER_READ, LOW_POWER_OPEN, LOW_POWER_CLOSE, S22_READ_DATA, S22_READ_STATE, S22_SETTING_STATE_OPEN, S22_SETTING_STATE_CLOSE, DETECT_PTT, BP_FUNCTION_READ, BP_FUNCTION_SETTING
            , WEATHER_READ_STATUEINFO, WEATHER_SETTING_STATUEINFO_ON, WEATHER_SETTING_STATUEINFO_OFF, WEATHER_SETTING_DATA, LIANSUO_SOS, LIANSUO_SEND_ORDER, LIANSUO_SEND_CONTENT, UI_UPDATE_AGPS, UI_UPDATE_CUSTOM, UI_UPDATE_SERVER
            , UI_UPDATE_G15IMG, SYNC_MUSIC_INFO_PLAY, SYNC_MUSIC_INFO_PAUSE, VOLUME,/*TEXT_ALARM_READ,TEXT_ALARM_ADD,TEXT_ALARM_MODIFY,TEXT_ALARM_DELETE,*/TEXT_ALARM, ORIGIN_LOG, RR, G15_QR_CODE, ECG_AUTO_REPORT_TEXT
            , START_BLOOD_GLUCOSE, STOP_BLOOD_GLUCOSE, BLOOD_GLUCOSE_P_READ, BLOOD_GLUCOSE_P_SETTING, BLOOD_GLUCOSE_MULTIPLE_READ, BLOOD_GLUCOSE_MULTIPLE_SETTING, FIND_DEVICE, BLE_RENAME, BT_RENAME, BT_READ, BLE_DISCONNECT, HEALTH_REMIND, FUNCTION_SWITCH,
            /*JL_NOTIFY_OPEN, JL_AUTH, JL_INIT_FILE_SYS, JL_SET_PHOTO_DIAL, JL_DEVICE_OTA, */JL_DEVICE, CONTACT, GATT_CLOSE, READ_ECG_ID,READ_ECG_DATA,SET_ECG_NEW_DATA_REPORT
    };
}