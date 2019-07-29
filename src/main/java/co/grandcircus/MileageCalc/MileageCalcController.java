package co.grandcircus.MileageCalc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MileageCalcController {
	@RequestMapping("/")
	public ModelAndView ShowIndex() {
		return new ModelAndView("index");
	}
	@RequestMapping("/mileage-form")
	public ModelAndView ShowForm() {
		return new ModelAndView("mileage-form");
	}
	@RequestMapping("/mileage-result")
	public ModelAndView ShowResult(
			@RequestParam("tankSize") double tankSize,
			@RequestParam("milesDriven") double milesDriven,
			@RequestParam("tripDist") double tripDist,
			@RequestParam("gasCost") double gasCost) {
		NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
		double result = milesDriven/tankSize;
		double tripCostInt = tripDist * (gasCost/result);
		String tripCost = defaultFormat.format(tripCostInt);
		int refuel = 0;
		if (tripDist % (result * tankSize) == 0) {
			refuel = (int) (tripDist / (result * tankSize));
		} else {
			refuel = (int) ((tripDist / (result * tankSize)) + 1);
		}
		BigDecimal bd = new BigDecimal(result);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		result = bd.doubleValue();
		
		
		ModelAndView mav = new ModelAndView("mileage-result");
		mav.addObject("tankSize", tankSize);
		mav.addObject("milesDriven", milesDriven);
		mav.addObject("result", result);
		mav.addObject("tripCost", tripCost);
		mav.addObject("gasCost", gasCost);
		mav.addObject("refuel", refuel);
		return mav;
	}
}
