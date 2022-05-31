package de.dlyt.yanndroid.beehive;

import android.content.Context;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ServerData {
    LineData temp_data, humid_data;
    Float lTempHive, lTempOut, lHumidHive, lHumidOut;
    String lDate;
    private String test_data = "[{\"Date_And_Time\":\"2022-03-22T16:06:15.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:06:25.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:06:36.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:06:46.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:07:06.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:07:16.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:07:27.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:07:37.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:07:47.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:07:59.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:08:07.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:08:19.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:08:28.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:08:38.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:08:48.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:08:58.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:09:08.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:09:19.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:09:29.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:09:39.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:09:49.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:09:59.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:10:09.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:10:20.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:10:30.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:10:40.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:10:50.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:11:00.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:11:10.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:11:21.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:11:35.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:11:41.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:11:51.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:12:01.000Z\",\"in_temp\":0,\"in_humi\":0,\"out_temp\":0,\"out_humi\":0},{\"Date_And_Time\":\"2022-03-22T16:12:37.000Z\",\"in_temp\":22,\"in_humi\":30,\"out_temp\":22.3,\"out_humi\":20.9},{\"Date_And_Time\":\"2022-03-22T16:12:42.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.3,\"out_humi\":20.6},{\"Date_And_Time\":\"2022-03-22T16:12:54.000Z\",\"in_temp\":21.9,\"in_humi\":31.2,\"out_temp\":22.3,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:13:03.000Z\",\"in_temp\":21.9,\"in_humi\":31.4,\"out_temp\":22.3,\"out_humi\":21.8},{\"Date_And_Time\":\"2022-03-22T16:13:15.000Z\",\"in_temp\":21.9,\"in_humi\":30.7,\"out_temp\":22.3,\"out_humi\":21.9},{\"Date_And_Time\":\"2022-03-22T16:13:25.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.3,\"out_humi\":21.8},{\"Date_And_Time\":\"2022-03-22T16:13:33.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.2,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:13:43.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.3,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:13:53.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.2,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:14:04.000Z\",\"in_temp\":21.9,\"in_humi\":30.7,\"out_temp\":22.3,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:14:14.000Z\",\"in_temp\":21.9,\"in_humi\":30.4,\"out_temp\":22.3,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:14:24.000Z\",\"in_temp\":21.9,\"in_humi\":31.1,\"out_temp\":22.3,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:14:34.000Z\",\"in_temp\":21.9,\"in_humi\":30.4,\"out_temp\":22.3,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:15:12.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.3,\"out_humi\":21.1},{\"Date_And_Time\":\"2022-03-22T16:15:20.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.4,\"out_humi\":20.7},{\"Date_And_Time\":\"2022-03-22T16:15:32.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.3,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:15:40.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:15:50.000Z\",\"in_temp\":21.9,\"in_humi\":30.8,\"out_temp\":22.4,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:16:01.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:16:11.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.3,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:16:21.000Z\",\"in_temp\":21.9,\"in_humi\":30.4,\"out_temp\":22.3,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:16:31.000Z\",\"in_temp\":21.9,\"in_humi\":30.2,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:16:41.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:16:53.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:17:02.000Z\",\"in_temp\":21.9,\"in_humi\":30.6,\"out_temp\":22.3,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:17:12.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.4,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:17:24.000Z\",\"in_temp\":21.9,\"in_humi\":30.2,\"out_temp\":22.4,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:17:32.000Z\",\"in_temp\":21.9,\"in_humi\":30.2,\"out_temp\":22.4,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:17:44.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.4,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:17:53.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.4,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:18:05.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.4,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:18:13.000Z\",\"in_temp\":21.9,\"in_humi\":30,\"out_temp\":22.4,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:18:23.000Z\",\"in_temp\":21.9,\"in_humi\":30,\"out_temp\":22.4,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:18:33.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.4,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:18:45.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.4,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:18:54.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.4,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:19:04.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.4,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:19:14.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:19:24.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.4,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:19:34.000Z\",\"in_temp\":21.9,\"in_humi\":30.2,\"out_temp\":22.4,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:19:45.000Z\",\"in_temp\":21.9,\"in_humi\":30.4,\"out_temp\":22.4,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:19:55.000Z\",\"in_temp\":21.9,\"in_humi\":31,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:20:05.000Z\",\"in_temp\":21.9,\"in_humi\":30.7,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:20:17.000Z\",\"in_temp\":21.9,\"in_humi\":30.7,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:20:27.000Z\",\"in_temp\":21.9,\"in_humi\":30.6,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:20:35.000Z\",\"in_temp\":21.9,\"in_humi\":30.6,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:20:46.000Z\",\"in_temp\":21.9,\"in_humi\":30.7,\"out_temp\":22.4,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:20:56.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.5,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:21:06.000Z\",\"in_temp\":21.9,\"in_humi\":30.6,\"out_temp\":22.5,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:21:16.000Z\",\"in_temp\":21.9,\"in_humi\":30.6,\"out_temp\":22.5,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:21:26.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.5,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:21:36.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.5,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:21:47.000Z\",\"in_temp\":21.9,\"in_humi\":30.1,\"out_temp\":22.5,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:21:57.000Z\",\"in_temp\":21.9,\"in_humi\":30.2,\"out_temp\":22.5,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:22:07.000Z\",\"in_temp\":21.9,\"in_humi\":30.4,\"out_temp\":22.6,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:22:23.000Z\",\"in_temp\":21.9,\"in_humi\":30,\"out_temp\":22.5,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:22:29.000Z\",\"in_temp\":21.9,\"in_humi\":30.2,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:22:39.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.5,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:22:49.000Z\",\"in_temp\":21.9,\"in_humi\":30.9,\"out_temp\":22.6,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:23:01.000Z\",\"in_temp\":21.9,\"in_humi\":30.5,\"out_temp\":22.6,\"out_humi\":21.8},{\"Date_And_Time\":\"2022-03-22T16:23:09.000Z\",\"in_temp\":21.9,\"in_humi\":30.3,\"out_temp\":22.5,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:23:19.000Z\",\"in_temp\":21.9,\"in_humi\":30.2,\"out_temp\":22.6,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:23:30.000Z\",\"in_temp\":21.9,\"in_humi\":30.2,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:23:40.000Z\",\"in_temp\":21.9,\"in_humi\":30,\"out_temp\":22.5,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:23:50.000Z\",\"in_temp\":22,\"in_humi\":30.5,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:24:00.000Z\",\"in_temp\":22,\"in_humi\":30.5,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:24:10.000Z\",\"in_temp\":22,\"in_humi\":30.9,\"out_temp\":22.6,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:24:21.000Z\",\"in_temp\":22,\"in_humi\":30.8,\"out_temp\":22.6,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:24:31.000Z\",\"in_temp\":22,\"in_humi\":30.6,\"out_temp\":22.6,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:24:41.000Z\",\"in_temp\":22,\"in_humi\":30.6,\"out_temp\":22.6,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:24:51.000Z\",\"in_temp\":22,\"in_humi\":30.5,\"out_temp\":22.6,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:25:01.000Z\",\"in_temp\":22,\"in_humi\":30.9,\"out_temp\":22.6,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:25:11.000Z\",\"in_temp\":22,\"in_humi\":30.2,\"out_temp\":22.7,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:25:22.000Z\",\"in_temp\":22,\"in_humi\":30.1,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:25:32.000Z\",\"in_temp\":22,\"in_humi\":30.7,\"out_temp\":22.7,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:25:42.000Z\",\"in_temp\":22,\"in_humi\":30.4,\"out_temp\":22.6,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:25:54.000Z\",\"in_temp\":22,\"in_humi\":30.5,\"out_temp\":22.6,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:26:06.000Z\",\"in_temp\":22,\"in_humi\":30.2,\"out_temp\":22.6,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:26:13.000Z\",\"in_temp\":22,\"in_humi\":30.1,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:26:25.000Z\",\"in_temp\":22,\"in_humi\":30.1,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:26:37.000Z\",\"in_temp\":22,\"in_humi\":30.1,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:26:45.000Z\",\"in_temp\":22,\"in_humi\":30,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:26:53.000Z\",\"in_temp\":22,\"in_humi\":30,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:27:03.000Z\",\"in_temp\":22,\"in_humi\":30.1,\"out_temp\":22.6,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:27:14.000Z\",\"in_temp\":22,\"in_humi\":31.1,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:27:24.000Z\",\"in_temp\":22,\"in_humi\":30.9,\"out_temp\":22.6,\"out_humi\":21.8},{\"Date_And_Time\":\"2022-03-22T16:27:34.000Z\",\"in_temp\":22,\"in_humi\":30.1,\"out_temp\":22.6,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:27:44.000Z\",\"in_temp\":22,\"in_humi\":30.6,\"out_temp\":22.6,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:27:54.000Z\",\"in_temp\":22,\"in_humi\":30.7,\"out_temp\":22.6,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:28:05.000Z\",\"in_temp\":22,\"in_humi\":30.3,\"out_temp\":22.6,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:28:15.000Z\",\"in_temp\":22,\"in_humi\":32.6,\"out_temp\":22.6,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:28:25.000Z\",\"in_temp\":22,\"in_humi\":31.2,\"out_temp\":22.7,\"out_humi\":21.7},{\"Date_And_Time\":\"2022-03-22T16:28:35.000Z\",\"in_temp\":22.1,\"in_humi\":33.3,\"out_temp\":22.7,\"out_humi\":22},{\"Date_And_Time\":\"2022-03-22T16:28:45.000Z\",\"in_temp\":22.1,\"in_humi\":31.7,\"out_temp\":22.7,\"out_humi\":21.8},{\"Date_And_Time\":\"2022-03-22T16:28:57.000Z\",\"in_temp\":22.1,\"in_humi\":30.7,\"out_temp\":22.7,\"out_humi\":21.8},{\"Date_And_Time\":\"2022-03-22T16:29:07.000Z\",\"in_temp\":22.1,\"in_humi\":30.5,\"out_temp\":22.7,\"out_humi\":21.9},{\"Date_And_Time\":\"2022-03-22T16:29:16.000Z\",\"in_temp\":22.1,\"in_humi\":30.2,\"out_temp\":22.7,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:29:26.000Z\",\"in_temp\":22.1,\"in_humi\":30.2,\"out_temp\":22.7,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:29:36.000Z\",\"in_temp\":22.1,\"in_humi\":30.8,\"out_temp\":22.6,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:29:46.000Z\",\"in_temp\":22.1,\"in_humi\":30.4,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:29:56.000Z\",\"in_temp\":22.1,\"in_humi\":30.6,\"out_temp\":22.7,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:30:11.000Z\",\"in_temp\":22.1,\"in_humi\":30.1,\"out_temp\":22.7,\"out_humi\":21.6},{\"Date_And_Time\":\"2022-03-22T16:30:17.000Z\",\"in_temp\":22.1,\"in_humi\":30.8,\"out_temp\":22.6,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:30:27.000Z\",\"in_temp\":22.1,\"in_humi\":30.1,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:30:37.000Z\",\"in_temp\":22.1,\"in_humi\":30,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:30:52.000Z\",\"in_temp\":22.1,\"in_humi\":29.9,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:30:58.000Z\",\"in_temp\":22.1,\"in_humi\":29.8,\"out_temp\":22.7,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:31:08.000Z\",\"in_temp\":22.1,\"in_humi\":30.5,\"out_temp\":22.7,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:31:18.000Z\",\"in_temp\":22.1,\"in_humi\":30.1,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:31:30.000Z\",\"in_temp\":22.1,\"in_humi\":30.2,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:31:38.000Z\",\"in_temp\":22.1,\"in_humi\":30.2,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:31:50.000Z\",\"in_temp\":22.1,\"in_humi\":30.1,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:31:59.000Z\",\"in_temp\":22.1,\"in_humi\":30,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:32:46.000Z\",\"in_temp\":22.1,\"in_humi\":30.2,\"out_temp\":22.7,\"out_humi\":20.6},{\"Date_And_Time\":\"2022-03-22T16:33:38.000Z\",\"in_temp\":22.1,\"in_humi\":30.7,\"out_temp\":22.7,\"out_humi\":20.6},{\"Date_And_Time\":\"2022-03-22T16:33:58.000Z\",\"in_temp\":22.1,\"in_humi\":30,\"out_temp\":22.8,\"out_humi\":20.4},{\"Date_And_Time\":\"2022-03-22T16:34:22.000Z\",\"in_temp\":22.1,\"in_humi\":30.2,\"out_temp\":22.8,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:34:39.000Z\",\"in_temp\":22.1,\"in_humi\":30.2,\"out_temp\":22.8,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:34:59.000Z\",\"in_temp\":22.1,\"in_humi\":30.1,\"out_temp\":22.8,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:35:19.000Z\",\"in_temp\":22.1,\"in_humi\":30.4,\"out_temp\":22.8,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:35:39.000Z\",\"in_temp\":22.1,\"in_humi\":30.5,\"out_temp\":22.8,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:36:00.000Z\",\"in_temp\":22.1,\"in_humi\":30.1,\"out_temp\":22.8,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:36:20.000Z\",\"in_temp\":22.1,\"in_humi\":30,\"out_temp\":22.8,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:36:42.000Z\",\"in_temp\":22.1,\"in_humi\":29.8,\"out_temp\":22.8,\"out_humi\":21.2},{\"Date_And_Time\":\"2022-03-22T16:37:00.000Z\",\"in_temp\":22.1,\"in_humi\":29.8,\"out_temp\":22.8,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:37:20.000Z\",\"in_temp\":22.1,\"in_humi\":30,\"out_temp\":22.8,\"out_humi\":21.2},{\"Date_And_Time\":\"2022-03-22T16:37:40.000Z\",\"in_temp\":22.1,\"in_humi\":29.9,\"out_temp\":22.8,\"out_humi\":21.2},{\"Date_And_Time\":\"2022-03-22T16:38:01.000Z\",\"in_temp\":22.1,\"in_humi\":29.8,\"out_temp\":22.8,\"out_humi\":21.2},{\"Date_And_Time\":\"2022-03-22T16:38:21.000Z\",\"in_temp\":22.1,\"in_humi\":30,\"out_temp\":22.7,\"out_humi\":21.1},{\"Date_And_Time\":\"2022-03-22T16:38:41.000Z\",\"in_temp\":22,\"in_humi\":30,\"out_temp\":22.7,\"out_humi\":21.2},{\"Date_And_Time\":\"2022-03-22T16:39:01.000Z\",\"in_temp\":22.1,\"in_humi\":29.9,\"out_temp\":22.8,\"out_humi\":21.2},{\"Date_And_Time\":\"2022-03-22T16:39:23.000Z\",\"in_temp\":22,\"in_humi\":30.2,\"out_temp\":22.7,\"out_humi\":21.2},{\"Date_And_Time\":\"2022-03-22T16:39:44.000Z\",\"in_temp\":22,\"in_humi\":30.3,\"out_temp\":22.8,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:40:02.000Z\",\"in_temp\":22,\"in_humi\":31.4,\"out_temp\":22.8,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:40:22.000Z\",\"in_temp\":22.1,\"in_humi\":30.7,\"out_temp\":22.7,\"out_humi\":21.5},{\"Date_And_Time\":\"2022-03-22T16:40:42.000Z\",\"in_temp\":22,\"in_humi\":30,\"out_temp\":22.8,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:41:02.000Z\",\"in_temp\":22,\"in_humi\":30.1,\"out_temp\":22.7,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:41:26.000Z\",\"in_temp\":22.1,\"in_humi\":29.8,\"out_temp\":22.7,\"out_humi\":21.3},{\"Date_And_Time\":\"2022-03-22T16:41:43.000Z\",\"in_temp\":22.1,\"in_humi\":29.9,\"out_temp\":22.8,\"out_humi\":21.2},{\"Date_And_Time\":\"2022-03-22T16:42:03.000Z\",\"in_temp\":22,\"in_humi\":30.2,\"out_temp\":22.8,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:42:23.000Z\",\"in_temp\":22.1,\"in_humi\":30.5,\"out_temp\":22.7,\"out_humi\":21.4},{\"Date_And_Time\":\"2022-03-22T16:42:48.000Z\",\"in_temp\":22,\"in_humi\":30.1,\"out_temp\":22.7,\"out_humi\":21.2},{\"Date_And_Time\":\"2022-03-22T16:43:03.000Z\",\"in_temp\":22.1,\"in_humi\":29.8,\"out_temp\":22.7,\"out_humi\":21.1},{\"Date_And_Time\":\"2022-03-22T16:43:23.000Z\",\"in_temp\":22.1,\"in_humi\":30.1,\"out_temp\":22.8,\"out_humi\":20.1}]";
    private Context context;

    public ServerData(Context context) {
        this.context = context;
    }

    public ServerData testData() {
        return parseJson(test_data);
    }

    public ServerData parseJson(String json) {
        if (json == null) return null;
        try {
            JSONArray jsonArray = new JSONArray(json);

            List<Entry> in_temps = new ArrayList<>();
            List<Entry> out_temps = new ArrayList<>();
            List<Entry> in_humids = new ArrayList<>();
            List<Entry> out_humids = new ArrayList<>();

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject entry = jsonArray.getJSONObject(i);
                in_temps.add(new Entry(i, lTempHive = (float) entry.getDouble("in_temp")));
                out_temps.add(new Entry(i, lTempOut = (float) entry.getDouble("out_temp")));
                in_humids.add(new Entry(i, lHumidHive = (float) entry.getDouble("in_humi")));
                out_humids.add(new Entry(i, lHumidOut = (float) entry.getDouble("out_humi")));
                if (i == jsonArray.length() - 1) lDate = entry.getString("Date_And_Time");
            }

            temp_data = new LineData();
            temp_data.addDataSet(initLineDataSet(new LineDataSet(in_temps, "Hive"), true));
            temp_data.addDataSet(initLineDataSet(new LineDataSet(out_temps, "Outside"), false));

            humid_data = new LineData();
            humid_data.addDataSet(initLineDataSet(new LineDataSet(in_humids, "Hive"), true));
            humid_data.addDataSet(initLineDataSet(new LineDataSet(out_humids, "Outside"), false));

            return this;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    private LineDataSet initLineDataSet(LineDataSet lineDataSet, boolean hive) {
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setColor(context.getColor(hive ? R.color.color_primary : R.color.green));
        lineDataSet.setHighlightEnabled(false);
        lineDataSet.setLineWidth(2);
        lineDataSet.setValueTextColor(context.getColor(dev.oneuiproject.oneui.R.color.oui_primary_text_color));
        return lineDataSet;
    }
}
