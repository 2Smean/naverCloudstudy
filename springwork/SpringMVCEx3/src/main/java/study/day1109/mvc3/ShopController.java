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

	@GetMapping("/shop/{path}") // shop으로 시작하는 두개짜리 maping 은 다 여기로 온다
//	public String list(@PathVariable("path") String path) :path와 변수명이 같을 경우 생략
	public String list(@PathVariable String path, Model model) {
		System.out.println(path);
		String shopinfo = "";
		if (path.equals("list"))
			shopinfo = "원피스 상품 목록";
		else if (path.equals("list2"))
			shopinfo = "슈즈 상품 목록";
		else
			shopinfo = "악세서리 상품 목록";

		// 상품 목록 담기
		List<ShopDto> list = new ArrayList<ShopDto>();
		if (path.equals("list1")) {
			list.add(new ShopDto("화이트 원피스", "2.jpg", 99000));
			list.add(new ShopDto("스포티 원피스", "25.jpg", 45000));
			list.add(new ShopDto("레이스 원피스", "28.jpg", 68000));
			list.add(new ShopDto("청 원피스", "33.jpg", 23000));
		} else if (path.equals("list2")) {
			list.add(new ShopDto("샤넬슈즈", "12.jpg", 150000));
			list.add(new ShopDto("구찌슈즈", "14.jpg", 98000));
			list.add(new ShopDto("플렛슈즈", "15.jpg", 33000));
		} else {
			list.add(new ShopDto("리본핀", "19.jpg", 34000));
			list.add(new ShopDto("머리띠", "30.jpg", 53000));
			list.add(new ShopDto("진주반지", "21.jpg", 3000));
			list.add(new ShopDto("머리끈", "26.jpg", 65000));
		}
		model.addAttribute("list", list);
		model.addAttribute("count", list.size());
		model.addAttribute("shopinfo", shopinfo);
		return "list1";
	}

	@GetMapping("/food/morning/brunch")
	public String brunch(Model model) {

		List<FoodDto> list = new ArrayList<FoodDto>();
		list.add(new FoodDto("스팸마요덮밥", "10.jpg", "강남"));
		list.add(new FoodDto("샌드위치", "8.jpg", "경기"));
		list.add(new FoodDto("연근", "9.jpg", "여의도"));
		model.addAttribute("list", list);
		model.addAttribute("today", new Date());
		model.addAttribute("message", "오늘의 브런치 메뉴들");
		return "list2";
	}

//	@GetMapping("/food/photo/detail") //이걸 더 많이 쓰긴함 
//	public String list(Model model) {
//		List<FoodDto> list = new ArrayList<FoodDto>();
//		list.add(new FoodDto("미국식백반", "K-041.png", "미국"));
//		list.add(new FoodDto("파스타", "K-042.png", "태국"));
//		list.add(new FoodDto("커피", "K-043.png", "이탈리아"));
//		model.addAttribute("list", list);
//		return "list3";
//	}
	
	@GetMapping("/food/photo/detail") //방법 2
	public ModelAndView detail() {
		ModelAndView mview = new ModelAndView();
		
		List<String > list = new ArrayList<String>();
		list.add("K-041.png");
		list.add("K-042.png");
		list.add("K-043.png");
		mview.addObject("food", list);
		mview.addObject("name", "이승민");
		mview.addObject("addr", "서울시 강남구");

		mview.setViewName("list3");

		return mview;
	}
}
