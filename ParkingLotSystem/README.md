# Parking Lot System (Java)

## 📌 Overview
A Java-based **Parking Lot Management System** supporting **Two-Wheeler** and **Four-Wheeler** parking.  
It manages:
- Spot allocation
- Ticket generation
- Payment verification
- Vehicle exit processing

---

## 🚗 Vehicle Types
- **TWO_WHEELER** — Bikes, Scooters
- **FOUR_WHEELER** — Cars, SUVs

---

## ⚙️ Workflow
1. **Vehicle Arrives** → Assigned a spot using `entranceGate`
2. **Ticket Generated** → Stores vehicle number, spot, and timestamp
3. **Vehicle Exits** → `exitGate` prompts payment
4. **Payment Check** → If incorrect, asks again until correct
5. **Spot Freed** → Ready for next vehicle

---

## 💳 Example Payment Flow
* Please pay: ₹20
* Enter payment amount: ₹20
* Parking spot id 101 is being emptied
* Please pay: ₹10
* Enter payment amount: ₹5
* Please pay remaining amount 5
* Enter payment amount: ₹5
* Parking spot id 3 is being emptied
* Please pay: ₹20
* Enter payment amount: ₹25
* Parking spot id 106 is being emptied
* Here is your change 5