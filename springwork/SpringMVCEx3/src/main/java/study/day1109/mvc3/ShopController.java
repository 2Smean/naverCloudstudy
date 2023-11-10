package study.day1109.mvc3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/shop/{path}") // shop���� �����ϴ� �ΰ�¥�� maping �� �� ����� �´�
//	public String list(@PathVariable("path") String path) :path�� �������� ���� ��� ����
	public String list(@PathVariable String path, Model model) {
		System.out.println(path);
		String shopinfo = "";
		if (path.equals("list"))
			shopinfo = "���ǽ� ��ǰ ���";
		else if (path.equals("list2"))
			shopinfo = "���� ��ǰ ���";
		else
			shopinfo = "�Ǽ����� ��ǰ ���";

		// ��ǰ ��� ���
		List<ShopDto> list = new ArrayList<ShopDto>();
		if (path.equals("list1")) {
			list.add(new ShopDto("ȭ��Ʈ ���ǽ�", "2.jpg", 99000));
			list.add(new ShopDto("����Ƽ ���ǽ�", "25.jpg", 45000));
			list.add(new ShopDto("���̽� ���ǽ�", "28.jpg", 68000));
			list.add(new ShopDto("û ���ǽ�", "33.jpg", 23000));
		} else if (path.equals("list2")) {
			list.add(new ShopDto("���ڽ���", "12.jpg", 150000));
			list.add(new ShopDto("�����", "14.jpg", 98000));
			list.add(new ShopDto("�÷�����", "15.jpg", 33000));
		} else {
			list.add(new ShopDto("������", "19.jpg", 34000));
			list.add(new ShopDto("�Ӹ���", "30.jpg", 53000));
			list.add(new ShopDto("���ֹ���", "21.jpg", 3000));
			list.add(new ShopDto("�Ӹ���", "26.jpg", 65000));
		}
		model.addAttribute("list", list);
		model.addAttribute("count", list.size());
		model.addAttribute("shopinfo", shopinfo);
		return "list1";
	}

	@GetMapping("/food/morning/brunch")
	public String brunch(Model model) {

		List<FoodDto> list = new ArrayList<FoodDto>();
		list.add(new FoodDto("���Ը��䵤��", "10.jpg", "����"));
		list.add(new FoodDto("������ġ", "8.jpg", "���"));
		list.add(new FoodDto("����", "9.jpg", "���ǵ�"));
		model.addAttribute("list", list);
		model.addAttribute("today", new Date());
		model.addAttribute("message", "������ �귱ġ �޴���");
		return "list2";
	}

//	@GetMapping("/food/photo/detail") //�̰� �� ���� ������ 
//	public String list(Model model) {
//		List<FoodDto> list = new ArrayList<FoodDto>();
//		list.add(new FoodDto("�̱��Ĺ��", "K-041.png", "�̱�"));
//		list.add(new FoodDto("�Ľ�Ÿ", "K-042.png", "�±�"));
//		list.add(new FoodDto("Ŀ��", "K-043.png", "��Ż����"));
//		model.addAttribute("list", list);
//		return "list3";
//	}
	
	@GetMapping("/food/photo/detail") //��� 2
	public ModelAndView detail() {
		ModelAndView mview = new ModelAndView();
		
		List<String > list = new ArrayList<String>();
		list.add("K-041.png");
		list.add("K-042.png");
		list.add("K-043.png");
		mview.addObject("food", list);
		mview.addObject("name", "�̽¹�");
		mview.addObject("addr", "����� ������");

		mview.setViewName("list3");

		return mview;
	}
}
