package com.bufnly.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.bufnly.model.CityBean;

@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;Encoding=utf-8");

		// System.out.println("ajax����");
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		List<CityBean> list = new ArrayList<>();
		String json = "";
		switch (id) {
		case 0:
			json = "[{'c_id':0,'c_name':'---��ѡ�����---'}]";
			break;
		case 1:
			CityBean c1 = new CityBean(0,"�ɶ���");
			CityBean c2 = new CityBean(1,"��ɽ��");
			CityBean c3 = new CityBean(2,"������");
			CityBean c4 = new CityBean(3,"�ϳ���");
			list.add(c1);
			list.add(c2);
			list.add(c3);
			list.add(c4);
			JSONArray ja = new JSONArray(list);
			json = ja.toString();
			break;
		case 2:
			CityBean c11 = new CityBean(0,"������");
			CityBean c12 = new CityBean(1,"�Ӱ���");
			CityBean c13 = new CityBean(2,"������");
			CityBean c14 = new CityBean(3,"��ɽ��");
			list.add(c11);
			list.add(c12);
			list.add(c13);
			list.add(c14);
			JSONArray ja1 = new JSONArray(list);
			json = ja1.toString();
			break;
		case 3:
			CityBean c21 = new CityBean(0,"������");
			CityBean c22 = new CityBean(1,"�麣��");
			CityBean c23 = new CityBean(2,"������");
			CityBean c24 = new CityBean(3,"��ݸ��");
			list.add(c21);
			list.add(c22);
			list.add(c23);
			list.add(c24);
			JSONArray ja2 = new JSONArray(list);
			json = ja2.toString();
			break;
		case 4:
			CityBean c31 = new CityBean(0,"�ϲ���");
			CityBean c32 = new CityBean(1,"�Ž���");
			CityBean c33 = new CityBean(2,"������");
			CityBean c34 = new CityBean(3,"������");
			list.add(c31);
			list.add(c32);
			list.add(c33);
			list.add(c34);
			JSONArray ja3 = new JSONArray(list);
			json = ja3.toString();
			break;

		default:
			json = null;
		}
		PrintWriter out = response.getWriter();
		out.write(json);
		out.flush();
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
